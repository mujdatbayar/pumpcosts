/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.ui;

import javax.swing.JTextField;

/**
 *
 * @author soner
 */
public class SparePartCostCellPanel extends javax.swing.JPanel {

    /**
     * Creates new form SparePartCostCellPanel
     */
    public SparePartCostCellPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfAmount = new javax.swing.JTextField();
        tfUnitCost = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(100, 45));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(100, 45));

        jLabel1.setText("Amount");

        jLabel2.setText("Unit Cost");
        jLabel2.setAlignmentX(0.5F);

        tfAmount.setText("0");
        tfAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAmountActionPerformed(evt);
            }
        });

        tfUnitCost.setText("0");
        tfUnitCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnitCostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUnitCost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUnitCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(5, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmountActionPerformed

    private void tfUnitCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnitCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUnitCostActionPerformed

    public JTextField getTfAmount() {
        return tfAmount;
    }

    public JTextField getTfUnitCost() {
        return tfUnitCost;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JTextField tfUnitCost;
    // End of variables declaration//GEN-END:variables
}

