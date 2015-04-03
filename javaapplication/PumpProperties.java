/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author soner
 */
public class PumpProperties {
    private double pressure;
    private double quantity;
    private double workingHour;
    private double efficiency;
    private double lifeTime;

    public PumpProperties() {
        this.pressure = 0.0;
        this.quantity = 0.0;
        this.workingHour = 0.0;
        this.efficiency = 0.0;
        this.lifeTime = 0.0;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(double workingHour) {
        this.workingHour = workingHour;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(double lifeTime) {
        this.lifeTime = lifeTime;
    }

}
