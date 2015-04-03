/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author soner
 */
public class MaintenancePercentageCost extends Cost{

    private int crewNumber;
    private int percentage;
    private double salary;
    private int percentage1;
    private double hours;
    private int percentage2;
    
    public MaintenancePercentageCost() {
        type = Cost.COST_RISE_PERCENTAGE;
        yearCount = 0;
    }
    
    public MaintenancePercentageCost(int yearCount) {
        type = Cost.COST_RISE_PERCENTAGE;
        this.yearCount = yearCount;
    }

    public int getCrewNumber() {
        return crewNumber;
    }

    public void setCrewNumber(int crewNumber) {
        this.crewNumber = crewNumber;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPercentage1() {
        return percentage1;
    }

    public void setPercentage1(int percentage1) {
        this.percentage1 = percentage1;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getPercentage2() {
        return percentage2;
    }

    public void setPercentage2(int percentage2) {
        this.percentage2 = percentage2;
    }
    
}
