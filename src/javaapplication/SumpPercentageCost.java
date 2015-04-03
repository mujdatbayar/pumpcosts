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
public class SumpPercentageCost extends Cost{

    private double baseValue;
    private int percentage;
    Vector<Integer> amounts;
    Vector<Double> sizes;
    
    public SumpPercentageCost() {
        type = Cost.COST_RISE_PERCENTAGE;
        yearCount = 0;
        amounts = new Vector<Integer>();
        sizes = new Vector<Double>();

    }
    
    public SumpPercentageCost(int yearCount) {
        type = Cost.COST_RISE_PERCENTAGE;
        this.yearCount = yearCount;
        amounts = new Vector<Integer>();
        sizes = new Vector<Double>();
    }

    public double getBaseValue() {
        return baseValue;
    }

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
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
