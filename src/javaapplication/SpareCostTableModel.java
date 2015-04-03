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
public class SpareCostTableModel extends DefaultTableModel {

        public SpareCostTableModel() {
        }

        @Override
        public Class<?> getColumnClass(int col) {
            if (col == 0) {
                return String.class;
            } else if (col > 0) {
                return SparePartCost.class;
            } else {
                return null;
            }
        }

        @Override
        public boolean isCellEditable(int row, int col) {
            return col > 0;
        }
        
    }
