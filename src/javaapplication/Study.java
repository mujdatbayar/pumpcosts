package javaapplication;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author mujdat
 */
public class Study {
    private int yearCount;
    
    //submersible
    private int submersibleTypeCount;
    private Vector<PumpProperties> submersiblePumpProperties;
    private Vector< Vector <Integer> > submersiblePumpAmounts;
    private Cost submersibleElectricityCost;
    private PumpSparePartCosts submersibleSparePartCost;
    private Cost submersibleMaintenanceCost;
    private Cost submersiblePipingCost;
    private Cost submersibleSumpCost;
    private Cost submersibleSumpCleanCost;
    private BaseCosts submersibleBaseCosts;
    
    //horizontal
    private int horizontalTypeCount;
    private Vector<PumpProperties> horizontalPumpProperties;
    private Vector< Vector <Integer> > horizontalPumpAmounts;
    private Cost horizontalElectricityCost;
    private PumpSparePartCosts horizontalSparePartCost;
    private Cost horizontalMaintenanceCost;
    private Cost horizontalPipingCost;
    private Cost horizontalSumpCost;
    private Cost horizontalSumpCleanCost;
    private BaseCosts horizontalBaseCosts;
    
    
    
    
    public Study() {
        yearCount = 0;
        submersibleTypeCount = 0;
        submersiblePumpProperties = new Vector<PumpProperties>();
        submersiblePumpAmounts = new Vector< Vector <Integer> >();
        submersibleElectricityCost = new PercentageCost();
        submersibleSparePartCost = new PumpSparePartCosts();
        submersibleMaintenanceCost = new MaintenancePercentageCost();
        submersiblePipingCost = new PercentageCost();
        submersibleSumpCost = new SumpUserDefinedCost();
        submersibleSumpCleanCost = new PercentageCost();
        submersibleBaseCosts = new BaseCosts();
        
        horizontalTypeCount = 0;
        horizontalPumpProperties = new Vector<PumpProperties>();
        horizontalPumpAmounts = new Vector< Vector <Integer> >();
        horizontalElectricityCost = new PercentageCost();
        horizontalSparePartCost = new PumpSparePartCosts();
        horizontalMaintenanceCost = new MaintenancePercentageCost();
        horizontalPipingCost = new PercentageCost();
        horizontalSumpCost = new SumpUserDefinedCost();
        horizontalSumpCleanCost = new PercentageCost();
        horizontalBaseCosts = new BaseCosts();
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

    public PumpSparePartCosts getSubmersibleSparePartCost() {
        return submersibleSparePartCost;
    }

    public void setSubmersibleSparePartCost(PumpSparePartCosts pSparePartCost) {
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
    
    
    //Horizontal
    public int getHorizontalTypeCount() {
        return horizontalTypeCount;
    }

    public void setHorizontalTypeCount(int horizontalTypeCount) {
        this.horizontalTypeCount = horizontalTypeCount;
    }

    public Vector<PumpProperties> getHorizontalPumpProperties() {
        return horizontalPumpProperties;
    }

    public void setHorizontalPumpProperties(Vector<PumpProperties> horizontalPumpProperties) {
        this.horizontalPumpProperties = horizontalPumpProperties;
    }

    public Vector<Vector<Integer>> getHorizontalPumpAmounts() {
        return horizontalPumpAmounts;
    }

    public void setHorizontalPumpAmounts(Vector<Vector<Integer>> horizontalPumpAmounts) {
        this.horizontalPumpAmounts = horizontalPumpAmounts;
    }

    public Cost getHorizontalElectricityCost() {
        return horizontalElectricityCost;
    }

    public void setHorizontalElectricityCost(Cost horizontalElectricityCost) {
        this.horizontalElectricityCost = horizontalElectricityCost;
    }

    public PumpSparePartCosts getHorizontalSparePartCost() {
        return horizontalSparePartCost;
    }

    public void setHorizontalSparePartCost(PumpSparePartCosts horizontalSparePartCost) {
        this.horizontalSparePartCost = horizontalSparePartCost;
    }

    public Cost getHorizontalMaintenanceCost() {
        return horizontalMaintenanceCost;
    }

    public void setHorizontalMaintenanceCost(Cost horizontalMaintenanceCost) {
        this.horizontalMaintenanceCost = horizontalMaintenanceCost;
    }

    public Cost getHorizontalPipingCost() {
        return horizontalPipingCost;
    }

    public void setHorizontalPipingCost(Cost horizontalPipingCost) {
        this.horizontalPipingCost = horizontalPipingCost;
    }

    public Cost getHorizontalSumpCost() {
        return horizontalSumpCost;
    }

    public void setHorizontalSumpCost(Cost horizontalSumpCost) {
        this.horizontalSumpCost = horizontalSumpCost;
    }

    public Cost getSubmersibleSumpCleanCost() {
        return submersibleSumpCleanCost;
    }

    public void setSubmersibleSumpCleanCost(Cost submersibleSumpCleanCost) {
        this.submersibleSumpCleanCost = submersibleSumpCleanCost;
    }

    public Cost getHorizontalSumpCleanCost() {
        return horizontalSumpCleanCost;
    }

    public void setHorizontalSumpCleanCost(Cost horizontalSumpCleanCost) {
        this.horizontalSumpCleanCost = horizontalSumpCleanCost;
    }

    public BaseCosts getSubmersibleBaseCosts() {
        return submersibleBaseCosts;
    }

    public void setSubmersibleBaseCosts(BaseCosts submersibleBaseCosts) {
        this.submersibleBaseCosts = submersibleBaseCosts;
    }

    public BaseCosts getHorizontalBaseCosts() {
        return horizontalBaseCosts;
    }

    public void setHorizontalBaseCosts(BaseCosts horizontalBaseCosts) {
        this.horizontalBaseCosts = horizontalBaseCosts;
    }
    
}
