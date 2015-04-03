/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author soner
 */
public class SparePartCost {
    private double amount;
    private double unitCost;
    
    public SparePartCost() {
        this.amount = 0.0;
        this.unitCost = 0.0;
    }

    public SparePartCost(double amount, double unitCost) {
        this.amount = amount;
        this.unitCost = unitCost;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
    
}
