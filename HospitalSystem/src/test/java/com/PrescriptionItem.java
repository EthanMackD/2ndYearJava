package test.java.com;

public class PrescriptionItem {
	private Medication medication;
    private int quantity;
    private int durationDays;
    private int refillsAllowed;
    private int refillsUsed;
    private boolean isEmergency;
    
    public PrescriptionItem(Medication medication, int quantity, 
                          int durationDays, int refillsAllowed,
                          boolean isEmergency) {
        this.medication = medication;
        this.quantity = quantity;
        this.durationDays = durationDays;
        this.refillsAllowed = refillsAllowed;
        this.refillsUsed = 0;
        this.isEmergency = isEmergency;
    }
    
    // Getters
    public Medication getMedication() { return medication; }
    public int getQuantity() { return quantity; }
    public int getDurationDays() { return durationDays; }
    public int getRefillsAllowed() { return refillsAllowed; }
    public int getRefillsUsed() { return refillsUsed; }
    public boolean isEmergency() { return isEmergency; }
    
    public boolean canRefill() {
        return refillsUsed < refillsAllowed;
    }
    
    public void refill() {
        if (!canRefill()) {
            throw new IllegalStateException("No refills remaining");
        }
        refillsUsed++;
    }
    
    public double getCost() {
        return medication.calculateCost();
    }
}
