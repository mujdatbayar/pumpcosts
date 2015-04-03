/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author soner
 */
public class PercentageCost extends Cost{

    private double baseValue;
    private int percentage;
    
    public PercentageCost() {
        type = Cost.COST_RISE_PERCENTAGE;
        yearCount = 0;
    }
    
    public PercentageCost(int yearCount) {
        type = Cost.COST_RISE_PERCENTAGE;
        this.yearCount = yearCount;
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
    
}
