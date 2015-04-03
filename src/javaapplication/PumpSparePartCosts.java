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
public class PumpSparePartCosts {
    private Vector<PumpSparePartCost> costs;

    public PumpSparePartCosts() {
        costs = new Vector<PumpSparePartCost>();
        costs.add(new PumpSparePartCost("Diffuser Coat"));
        costs.add(new PumpSparePartCost("Oil Housing"));
        costs.add(new PumpSparePartCost("Suction Cover"));
        costs.add(new PumpSparePartCost("Impeller"));
        costs.add(new PumpSparePartCost("Mechanical Seal"));
        costs.add(new PumpSparePartCost("Seal"));
        costs.add(new PumpSparePartCost("O Ring Kit"));
        costs.add(new PumpSparePartCost("Washers"));
        costs.add(new PumpSparePartCost("Shaft"));
        costs.add(new PumpSparePartCost("Shaft Seal"));
        costs.add(new PumpSparePartCost("Relief Valve"));
        costs.add(new PumpSparePartCost("Flangs"));
        costs.add(new PumpSparePartCost("Bearings"));
        costs.add(new PumpSparePartCost("Others"));
    }

    public Vector<PumpSparePartCost> getCosts() {
        return costs;
    }

    public void setCosts(Vector<PumpSparePartCost> costs) {
        this.costs = costs;
    }

    public PumpSparePartCost getDiffuserCoatCost() {
        return costs.get(0);
    }

    public void setDiffuserCoatCost(PumpSparePartCost diffuserCoatCost) {
        costs.setElementAt(diffuserCoatCost, 0);
    }

    public PumpSparePartCost getOilHousingCost() {
        return costs.get(1);
    }

    public PumpSparePartCost getSuctionCoverCost() {
        return costs.get(2);
    }

    public PumpSparePartCost getImpellerCost() {
        return costs.get(3);
    }

    public PumpSparePartCost getMechanicalSealCost() {
        return costs.get(4);
    }

    public PumpSparePartCost getSealCost() {
        return costs.get(5);
    }

    public PumpSparePartCost getoRingKitCost() {
        return costs.get(6);
    }

    public PumpSparePartCost getWashersCost() {
        return costs.get(7);
    }

    public PumpSparePartCost getShaftCost() {
        return costs.get(8);
    }

    public PumpSparePartCost getShaftSealCost() {
        return costs.get(9);
    }

    public PumpSparePartCost getReliefValveCost() {
        return costs.get(10);
    }

    public PumpSparePartCost getFlangsCost() {
        return costs.get(11);
    }

    public PumpSparePartCost getBearingsCost() {
        return costs.get(12);
    }

    public PumpSparePartCost getOtherCost() {
        return costs.get(13);
    }  
    
    public void setCost(String name, PumpSparePartCost cost) {
        switch (name) {
                
            case "Diffuser Coat":
                costs.setElementAt(cost, 0);
                break;
            case "Oil Housing":
                costs.setElementAt(cost, 1);
                break;
            case "Suction Cover":
                costs.setElementAt(cost, 2);
                break;
            case "Impeller":
                costs.setElementAt(cost, 3);
                break;
            case "Mechanical Seal":
                costs.setElementAt(cost, 4);
                break;
            case "Seal":
                costs.setElementAt(cost, 5);
                break;
            case "O Ring Kit":
                costs.setElementAt(cost, 6);
                break;
            case "Washers":
                costs.setElementAt(cost, 7);
                break;
            case "Shaft":
                costs.setElementAt(cost, 8);
                break;
            case "Shaft Seal":
                costs.setElementAt(cost, 9);
                break;
            case "Relief Valve":
                costs.setElementAt(cost, 10);
                break;
            case "Flangs":
                costs.setElementAt(cost, 11);
                break;
            case "Bearings":
                costs.setElementAt(cost, 12);
                break;
            case "Others":
                costs.setElementAt(cost, 13);
                break;
        }
    }
}
