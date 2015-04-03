/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soner
 */
public class CostDefaultTableModel extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int col) { // custom isCellEditable function
       return col > 0;
    }
    
    public Class getColumnClass(int columnIndex) {
        if(columnIndex > 0) {
            return java.lang.Double.class;
        }
        else {
            return java.lang.Integer.class;
        }
        
    }

}
