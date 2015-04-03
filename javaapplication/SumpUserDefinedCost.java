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
public class SumpUserDefinedCost extends Cost{
    private Vector<Double> costValues;
    Vector<Integer> amounts;
    Vector<Double> sizes;
    
    public SumpUserDefinedCost() {
        type = Cost.COST_RISE_USER_DEFINED;
        yearCount = 0;
        costValues = new Vector<Double>();
        amounts = new Vector<Integer>();
        sizes = new Vector<Double>();
    }
    
    public SumpUserDefinedCost(int yearCount) {
        type = Cost.COST_RISE_USER_DEFINED;
        this.yearCount = yearCount;
        costValues = new Vector<Double>();
        amounts = new Vector<Integer>();
        sizes = new Vector<Double>();
    }

    public Vector<Double> getCostValues() {
        return costValues;
    }

    public void setCostValues(Vector<Double> costValues) {
        this.costValues = costValues;
    }

    public Vector<Integer> getAmounts() {
        return amounts;
    }

    public void setAmounts(Vector<Integer> amounts) {
        this.amounts = amounts;
    }

    public Vector<Double> getSizes() {
        return sizes;
    }

    public void setSizes(Vector<Double> sizes) {
        this.sizes = sizes;
    }
    
}
