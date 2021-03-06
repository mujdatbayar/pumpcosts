/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.ui;

import java.util.Vector;
import javaapplication.BaseCosts;
import javaapplication.Cost;
import javaapplication.CostDefaultTableModel;
import javaapplication.MyDefaultTableModel;
import javaapplication.PercentageCost;
import javaapplication.PumpProperties;
import javaapplication.PumpSparePartCost;
import javaapplication.SpareCostTableModel;
import javaapplication.SparePartCost;
import javaapplication.UserDefinedCost;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author soner
 */
public class BaseCostPanel extends javax.swing.JPanel {

    private int typeCount;
    private int yearCount;
    int prevSelectedIndex;
    private String selection;
    private Vector<Vector<Double>> pumpInitialCosts;
    private Vector<Vector<Double>> bbCosts;
    private Vector<Double> interest;
    /**
     * Creates new form CostPanel
     */
    public BaseCostPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        costTablePane = new javax.swing.JScrollPane();
        baseCostTable = new javax.swing.JTable();
        baseCombo = new javax.swing.JComboBox();

        setToolTipText("");
        setName("costPanel"); // NOI18N

        costTablePane.setBorder(null);

        baseCostTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        baseCostTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        baseCostTable.getTableHeader().setReorderingAllowed(false);
        costTablePane.setViewportView(baseCostTable);

        baseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(costTablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(baseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 316, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(costTablePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("costPanel");
    }// </editor-fold>//GEN-END:initComponents

    private void baseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseComboActionPerformed
        JComboBox cb = (JComboBox)evt.getSource();
        selection = (String)cb.getSelectedItem();
        getTableValues();
        if(selection != null){
            updateCostPanel(selection);
        }        
        prevSelectedIndex = cb.getSelectedIndex();
    }//GEN-LAST:event_baseComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox baseCombo;
    private javax.swing.JTable baseCostTable;
    private javax.swing.JScrollPane costTablePane;
    // End of variables declaration//GEN-END:variables

    private void getTableValues() {
        if (prevSelectedIndex != -1) {
            
            String name = (String) baseCombo.getItemAt(prevSelectedIndex);
            if(name.equals("Pump")){
                pumpInitialCosts = getCostFromTable();
            }
            else if(name.equals("Buy Back")){
                bbCosts = getCostFromTable();
            }
            else if(name.equals("Interest")){
                interest = getInterestFromTable();
            }

        }
    }
    
   private void updateCostPanel(String selection) {
       CostDefaultTableModel model = new CostDefaultTableModel();
       model.addColumn("Year");
       if(selection.equals("Pump")){
           Vector<Vector<Double>> curCosts = pumpInitialCosts;
           fillModelWithCost(model, curCosts);
       }
       else if(selection.equals("Buy Back")) {
           Vector<Vector<Double>> curCosts = bbCosts;
           fillModelWithCost(model, curCosts);
       }
       else if(selection.equals("Interest")) {
           Vector<Double> interestValues = interest;
           fillModelWithInterest(model, interestValues);
       }
               
      baseCostTable.setModel(model);
            
      int columns = baseCostTable.getColumnCount();
      for(int j = 0; j< columns; j++) {
          baseCostTable.getColumnModel().getColumn(j).setPreferredWidth(110);
      }
            
    }    
    public BaseCosts getCost() {
        getTableValues();
        javaapplication.BaseCosts newCost = new BaseCosts();
        newCost.setPumpInvestmentCosts(pumpInitialCosts);
        newCost.setBuyBackCosts(bbCosts);
        newCost.setInterestValues(interest);
        return newCost;
        
    }
    
    public void initCostPanel(BaseCosts cost, int typeCnt, int yearCnt) {
        typeCount = typeCnt;
        yearCount = yearCnt;
        pumpInitialCosts = cost.getPumpInvestmentCosts();
        bbCosts = cost.getBuyBackCosts();
        interest = cost.getInterestValues();
        int i;
        for(i = pumpInitialCosts.size(); i < yearCount; i++) {
            Vector<Double> typeCosts = new Vector<>();
            for (int k = 0; k < typeCount; k++) {
                typeCosts.add(0.0);
            }
            pumpInitialCosts.add(typeCosts);
        }
        for(i = bbCosts.size(); i < yearCount; i++) {
            Vector<Double> typeCosts = new Vector<>();
            for (int k = 0; k < typeCount; k++) {
                typeCosts.add(0.0);
            }
            bbCosts.add(typeCosts);
        }
        for(i = interest.size(); i < yearCount; i++) {
            interest.add(0.0);
        }
                            
        
        prevSelectedIndex = -1;
        baseCombo.removeAllItems();
        prevSelectedIndex = -1;
        baseCombo.addItem("Pump");
        baseCombo.addItem("Buy Back");
        baseCombo.addItem("Interest");
        baseCombo.setSelectedIndex(0);
        
    }
    
    private void fillModelWithCost(CostDefaultTableModel model, Vector<Vector<Double>> curCosts){
        for(int i = 0; i< typeCount; i++) {
           model.addColumn("Type " + (i+1) + " ($)");
        }
        for(int j = 0; j < yearCount; j++) {
                   Vector<Object> values = new Vector<>();
                   values.clear();
                   values.add(Integer.toString(j+1));
                   Vector<Double> typeCosts = null;
                   if(curCosts.size() > j) {
                       typeCosts = curCosts.get(j);
                   }
                   
                    for (int k = 0; k < typeCount; k++) {
                            if (typeCosts != null && typeCosts.size() > k) {
                                    values.add(typeCosts.get(k));
                            } else {
                                    values.add(0.0);
                            }
                    }
                    model.addRow(values);
               }
    }
    
    private void fillModelWithInterest(CostDefaultTableModel model, Vector<Double> interest){
        model.addColumn("Interest (%)");
        for(int j = 0; j < yearCount; j++) {
                   Vector<Object> values = new Vector<>();
                   values.clear();
                   values.add(Integer.toString(j+1));
                   if(interest.size() > j){
                       values.add(interest.get(j));
                   }
                   else{
                       values.add(0.0);
                   }
                    model.addRow(values);
               }
    }
    
    private Vector<Vector<Double>> getCostFromTable(){
        Vector< Vector<Double>> values = new Vector< Vector<Double>>();
            for (int i = 0; i < baseCostTable.getRowCount(); i++) {
                Vector<Double> typeVal = new Vector<Double>();
                for (int j = 1; j < baseCostTable.getColumnCount(); j++) {
                    Double cost = (Double) baseCostTable.getValueAt(i, j);
                    typeVal.add(cost);
                }
                values.add(typeVal);
            }
        return values;
    }
    
    private Vector<Double> getInterestFromTable(){
        Vector<Double> interest = new Vector<Double>();
        for (int i = 0; i < baseCostTable.getRowCount(); i++) {
           Double cost = (Double) baseCostTable.getValueAt(i, 1);
                    interest.add(cost);
                }
        return interest;
    }
}
