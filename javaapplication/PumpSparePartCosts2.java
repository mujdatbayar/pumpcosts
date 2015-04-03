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
public class PumpSparePartCosts2 {
    private Vector<PumpSparePartCost> costs;

    public PumpSparePartCosts2() {
        costs = new Vector<PumpSparePartCost>();
        costs.add(new PumpSparePartCost("Suction Valve"));
        costs.add(new PumpSparePartCost("Discharge Valve"));
        costs.add(new PumpSparePartCost("Diapraghm"));
        costs.add(new PumpSparePartCost("Piston Rods"));
        costs.add(new PumpSparePartCost("Dampener"));
        costs.add(new PumpSparePartCost("Pump"));
        costs.add(new PumpSparePartCost("Valve Seats"));
        costs.add(new PumpSparePartCost("2-2 Way Valves"));
        costs.add(new PumpSparePartCost("3-2 Way Valves"));
        costs.add(new PumpSparePartCost("Others"));
    }

    public Vector<PumpSparePartCost> getCosts() {
        return costs;
    }

    public void setCosts(Vector<PumpSparePartCost> costs) {
        this.costs = costs;
    }

    public PumpSparePartCost getSuctionValveCost() {
        return costs.get(0);
    }

    public void setSuctionValveCost(PumpSparePartCost diffuserCoatCost) {
        costs.setElementAt(diffuserCoatCost, 0);
    }

    public PumpSparePartCost getDischargeValveCost() {
        return costs.get(1);
    }

    public PumpSparePartCost getDiapraghmCost() {
        return costs.get(2);
    }

    public PumpSparePartCost getPistonRodsCost() {
        return costs.get(3);
    }

    public PumpSparePartCost getDampenerCost() {
        return costs.get(4);
    }

    public PumpSparePartCost getPumpCost() {
        return costs.get(5);
    }

    public PumpSparePartCost getValveSeatsCost() {
        return costs.get(6);
    }

    public PumpSparePartCost get22WayValvesCost() {
        return costs.get(7);
    }

    public PumpSparePartCost get32WayValvesCost() {
        return costs.get(8);
    }

    public PumpSparePartCost getOtherCost() {
        return costs.get(9);
    }  
    
    public void setCost(String name, PumpSparePartCost cost) {
        switch (name) {
                
            case "Suction Valve":
                costs.setElementAt(cost, 0);
                break;
            case "Discharge Valve":
                costs.setElementAt(cost, 1);
                break;
            case "Diapraghm":
                costs.setElementAt(cost, 2);
                break;
            case "Piston Rods":
                costs.setElementAt(cost, 3);
                break;
            case "Dampener":
                costs.setElementAt(cost, 4);
                break;
            case "Pump":
                costs.setElementAt(cost, 5);
                break;
            case "Valve Seats":
                costs.setElementAt(cost, 6);
                break;
            case "2-2 Way Valves":
                costs.setElementAt(cost, 7);
                break;
            case "3-2 Way Valves":
                costs.setElementAt(cost, 8);
                break;
            case "Others":
                costs.setElementAt(cost, 9);
                break;
        }
    }
}
