/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javaapplication.SparePartCost;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

    public class ValueRenderer extends SparePartCostCellPanel
        implements TableCellRenderer {

        public ValueRenderer() {
            this.setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int col) {
            SparePartCost v = (SparePartCost) value;
            this.getTfAmount().setText(Double.toString(v.getAmount()));
            this.getTfUnitCost().setText(Double.toString(v.getUnitCost()));
            if(row%2 == 0){
                this.setOpaque(false);
            }
            else{
                this.setOpaque(true);
            }
            return this;
        }
    }
