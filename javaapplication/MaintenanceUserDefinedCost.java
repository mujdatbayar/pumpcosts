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
public class MaintenanceUserDefinedCost extends Cost{
    private Vector<Integer> crewNumbers;
    private Vector<Double> salaries;
    private Vector<Double> hourValues;
    
    public MaintenanceUserDefinedCost() {
        type = Cost.COST_RISE_USER_DEFINED;
        yearCount = 0;
        crewNumbers = new Vector<Integer>();
        salaries = new Vector<Double>();
        hourValues = new Vector<Double>();
    }
    
    public MaintenanceUserDefinedCost(int yearCount) {
        type = Cost.COST_RISE_USER_DEFINED;
        this.yearCount = yearCount;
        crewNumbers = new Vector<Integer>();
        salaries = new Vector<Double>();
        hourValues = new Vector<Double>();
    }

    public Vector<Integer> getCrewNumbers() {
        return crewNumbers;
    }

    public void setCrewNumbers(Vector<Integer> crewNumbers) {
        this.crewNumbers = crewNumbers;
    }

    public Vector<Double> getSalaries() {
        return salaries;
    }

    public void setSalaries(Vector<Double> salaries) {
        this.salaries = salaries;
    }

    public Vector<Double> getHourValues() {
        return hourValues;
    }

    public void setHourValues(Vector<Double> hourValues) {
        this.hourValues = hourValues;
    } 
    
}
