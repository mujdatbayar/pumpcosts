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
public class BaseCosts2{
    
    private Vector<Vector<Double>> pumpInvestmentCosts;
    private Vector<Vector<Double>> buyBackCosts;
    private Vector<Vector<Double>> screenCosts;
    private Vector<Vector<Double>> drainageChannelsCosts;
    private Vector<Vector<Double>> agitator;
    private Vector<Vector<Double>> pumpHouse;
    private Vector<Double> interestValues;
    
    public BaseCosts2() {
        interestValues  = new Vector<Double>();
        pumpInvestmentCosts = new Vector<Vector<Double>>();
        buyBackCosts = new Vector<Vector<Double>>();
        screenCosts = new Vector<Vector<Double>>();
        drainageChannelsCosts = new Vector<Vector<Double>>();
        agitator = new Vector<Vector<Double>>();
        pumpHouse = new Vector<Vector<Double>>();
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

    public Vector<Vector<Double>> getScreenCosts() {
        return screenCosts;
    }

    public void setScreenCosts(Vector<Vector<Double>> screenCosts) {
        this.screenCosts = screenCosts;
    }

    public Vector<Vector<Double>> getDrainageChannelsCosts() {
        return drainageChannelsCosts;
    }

    public void setDrainageChannelsCosts(Vector<Vector<Double>> drainageChannelsCosts) {
        this.drainageChannelsCosts = drainageChannelsCosts;
    }

    public Vector<Vector<Double>> getAgitator() {
        return agitator;
    }

    public void setAgitator(Vector<Vector<Double>> agitator) {
        this.agitator = agitator;
    }

    public Vector<Vector<Double>> getPumpHouse() {
        return pumpHouse;
    }

    public void setPumpHouse(Vector<Vector<Double>> pumpHouse) {
        this.pumpHouse = pumpHouse;
    }
    
}
