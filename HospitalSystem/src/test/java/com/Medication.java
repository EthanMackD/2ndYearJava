package test.java.com;

public class Medication implements Chargeable {
    private String name;
    private MedicationType type;
    private String dosage;
    private String instructions;
    private double cost;
    
    public Medication(String name, MedicationType type, String dosage,
                     String instructions, double cost) {
        this.name = name;
        this.type = type;
        this.dosage = dosage;
        this.instructions = instructions;
        this.cost = cost;
    }
    
    // Getters
    public String getName() { return name; }
    public MedicationType getType() { return type; }
    public String getDosage() { return dosage; }
    public String getInstructions() { return instructions; }
    
    @Override
    public double calculateCost() { return cost; }
    
    public int getValidityDays() {
        return type.getValidityDays();
    }
}
