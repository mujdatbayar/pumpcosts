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
public class BaseCosts{
    
    private Vector<Vector<Double>> pumpInvestmentCosts;
    private Vector<Vector<Double>> buyBackCosts;
    private Vector<Double> interestValues;
    
    public BaseCosts() {
        interestValues  = new Vector<Double>();
        pumpInvestmentCosts = new Vector<Vector<Double>>();
        buyBackCosts = new Vector<Vector<Double>>();
    }

    public Vector<Double> getInterestValues() {
        return interestValues;
    }

    public void setInterestValues(Vector<Double> interestValues) {
        this.interestValues = interestValues;
    }

    public Vector<Vector<Double>> getPumpInvestmentCosts() {
        return pumpInvestmentCosts;
    }

    public void setPumpInvestmentCosts(Vector<Vector<Double>> pumpInvestmentCosts) {
        this.pumpInvestmentCosts = pumpInvestmentCosts;
    }

    public Vector<Vector<Double>> getBuyBackCosts() {
        return buyBackCosts;
    }

    public void setBuyBackCosts(Vector<Vector<Double>> buyBackCosts) {
        this.buyBackCosts = buyBackCosts;
    }
    
}
