/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.ui;

import java.awt.Component;
import javaapplication.SparePartCost;
import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

    public class ValueEditor extends AbstractCellEditor
        implements TableCellEditor{

        private ValueRenderer vr = new ValueRenderer();

        public ValueEditor() {
        }

        @Override
        public Object getCellEditorValue() {
            double amount = Double.parseDouble(vr.getTfAmount().getText());
            double unitCost = Double.parseDouble(vr.getTfUnitCost().getText());
            SparePartCost v = new SparePartCost(amount, unitCost);
            return v;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table,
            Object value, boolean isSelected, int row, int col) {
            SparePartCost v = (SparePartCost) value;
            vr.getTfAmount().setText(Double.toString(v.getAmount()));
            vr.getTfUnitCost().setText(Double.toString(v.getUnitCost()));
            return vr;
        }

    }
