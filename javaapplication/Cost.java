/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author soner
 */
public abstract class Cost {
    public static String COST_RISE_USER_DEFINED = "User";
    public static String COST_RISE_PERCENTAGE = "Percentage";
    
    protected String type;
    protected int yearCount;

    public String getType() {
        return type;
    }

    public int getYearCount() {
        return yearCount;
    }

    public void setYearCount(int yearCount) {
        this.yearCount = yearCount;
    }
    
    
}
