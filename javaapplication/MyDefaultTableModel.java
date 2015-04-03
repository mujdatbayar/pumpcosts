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
public class MyDefaultTableModel extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int col) { // custom isCellEditable function
       return col > 0;
    }
    
    public Class getColumnClass(int columnIndex) {
        return java.lang.Integer.class;
    }

}
