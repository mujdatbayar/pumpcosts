/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Vector;

/**
 *
 * @author soner
 */
public class UserDefinedCost extends Cost{
    private Vector<Double> costValues;
    
    public UserDefinedCost() {
        type = Cost.COST_RISE_USER_DEFINED;
        yearCount = 0;
        costValues = new Vector<Double>();
    }
    
    public UserDefinedCost(int yearCount) {
        type = Cost.COST_RISE_USER_DEFINED;
        this.yearCount = yearCount;
        costValues = new Vector<Double>();
    }

    public Vector<Double> getCostValues() {
        return costValues;
    }

    public void setCostValues(Vector<Double> costValues) {
        this.costValues = costValues;
    }
    
    
}
