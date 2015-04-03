package javaapplication;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author mujdat
 */
public class Study2 {
    private int yearCount;
    
    //submersible
    private int submersibleTypeCount;
    private Vector<PumpProperties> submersiblePumpProperties;
    private Vector< Vector <Integer> > submersiblePumpAmounts;
    private Cost submersibleElectricityCost;
    private PumpSparePartCosts2 submersibleSparePartCost;
    private Cost submersibleMaintenanceCost;
    private Cost submersiblePipingCost;
    private Cost submersibleSumpCost;
    private Cost submersibleSumpCleanCost;
    private BaseCosts2 submersibleBaseCosts;
     
    public Study2() {
        yearCount = 0;
        submersibleTypeCount = 0;
        submersiblePumpProperties = new Vector<PumpProperties>();
        submersiblePumpAmounts = new Vector< Vector <Integer> >();
        submersibleElectricityCost = new PercentageCost();
        submersibleSparePartCost = new PumpSparePartCosts2();
        submersibleMaintenanceCost = new MaintenancePercentageCost();
        submersiblePipingCost = new PercentageCost();
        submersibleSumpCost = new SumpUserDefinedCost();
        submersibleSumpCleanCost = new PercentageCost();
        submersibleBaseCosts = new BaseCosts2();
    }

    public int getYearCount() {
        return yearCount;
    }

    public void setYearCount(int yearCount) {
        this.yearCount = yearCount;
    }

    public int getSubmersibleTypeCount() {
        return submersibleTypeCount;
    }

    public void setSubmersibleTypeCount(int submersibleTypeCount) {
        this.submersibleTypeCount = submersibleTypeCount;
    }

    public Vector<PumpProperties> getSubmersiblePumpProperties() {
        return submersiblePumpProperties;
    }

    public void setSubmersiblePumpProperties(Vector<PumpProperties> submersiblePumpProperties) {
        this.submersiblePumpProperties = submersiblePumpProperties;
    }

    public Vector<Vector<Integer>> getSubmersiblePumpAmounts() {
        return submersiblePumpAmounts;
    }

    public void setSubmersiblePumpAmounts(Vector<Vector<Integer>> submersiblePumpAmounts) {
        this.submersiblePumpAmounts = submersiblePumpAmounts;
    }

    public Cost getSubmersibleElectricityCost() {
        return submersibleElectricityCost;
    }

    public void setSubmersibleElectricityCost(Cost submersibleElectricityCost) {
        this.submersibleElectricityCost = submersibleElectricityCost;
    }

    public PumpSparePartCosts2 getSubmersibleSparePartCost2() {
        return submersibleSparePartCost;
    }

    public void setSubmersibleSparePartCost2(PumpSparePartCosts2 pSparePartCost) {
        this.submersibleSparePartCost = pSparePartCost;
    }

    public Cost getSubmersibleMaintenanceCost() {
        return submersibleMaintenanceCost;
    }

    public void setSubmersibleMaintenanceCost(Cost submersibleMaintenanceCost) {
        this.submersibleMaintenanceCost = submersibleMaintenanceCost;
    }

    public Cost getSubmersiblePipingCost() {
        return submersiblePipingCost;
    }

    public void setSubmersiblePipingCost(Cost submersiblePipingCost) {
        this.submersiblePipingCost = submersiblePipingCost;
    } 

    public Cost getSubmersibleSumpCost() {
        return submersibleSumpCost;
    }

    public void setSubmersibleSumpCost(Cost submersibleSumpCost) {
        this.submersibleSumpCost = submersibleSumpCost;
    }
    
    public Cost getSubmersibleSumpCleanCost() {
        return submersibleSumpCleanCost;
    }

    public void setSubmersibleSumpCleanCost(Cost submersibleSumpCleanCost) {
        this.submersibleSumpCleanCost = submersibleSumpCleanCost;
    }

    public BaseCosts2 getSubmersibleBaseCosts() {
        return submersibleBaseCosts;
    }

    public void setSubmersibleBaseCosts(BaseCosts2 submersibleBaseCosts) {
        this.submersibleBaseCosts = submersibleBaseCosts;
    }
    
}
