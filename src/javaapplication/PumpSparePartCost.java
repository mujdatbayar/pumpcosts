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
public class PumpSparePartCost {
    private Vector< Vector<SparePartCost>> costs;
    private String name;

    public PumpSparePartCost(String name) {
        costs = new Vector< Vector<SparePartCost>>();
        this.name = name;
    }

    public Vector< Vector<SparePartCost>> getCosts() {
        return costs;
    }

    public void setCosts(Vector< Vector<SparePartCost>> costs) {
        this.costs = costs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
