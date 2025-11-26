package test.java.com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Prescription implements Expirable, Chargeable {
    private String prescriptionId;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime issueDateTime;
    private LocalDate expiryDate;
    private List<PrescriptionItem> items;
    private String pharmacyName;
    private String pharmacistName;
    private LocalDateTime dispensedDateTime;
    
    public Prescription(String prescriptionId, Patient patient, Doctor doctor,
                       LocalDateTime issueDateTime) {
        this.prescriptionId = prescriptionId;
        this.patient = patient;
        this.doctor = doctor;
        this.issueDateTime = issueDateTime;
        this.items = new ArrayList<>();
        // Default 90-day validity (can be recalculated based on medications)
        this.expiryDate = issueDateTime.toLocalDate().plusDays(90);
    }
    
    // Getters
    public String getPrescriptionId() { return prescriptionId; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public LocalDateTime getIssueDateTime() { return issueDateTime; }
    public List<PrescriptionItem> getItems() { return items; }
    
    @Override
    public LocalDate getExpiryDate() { return expiryDate; }
    
    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
    
    public void addItem(PrescriptionItem item) {
        items.add(item);
        // Recalculate expiry based on shortest medication validity
        updateExpiryDate();
    }
    
    private void updateExpiryDate() {
        if (items.isEmpty()) return;
        
        int minValidityDays = items.stream()
            .mapToInt(item -> item.getMedication().getValidityDays())
            .min()
            .orElse(90);
        
        this.expiryDate = issueDateTime.toLocalDate().plusDays(minValidityDays);
    }
    
    @Override
    public double calculateCost() {
        return items.stream()
            .mapToDouble(PrescriptionItem::getCost)
            .sum();
    }
    
    public double calculatePatientCost() {
        double totalCost = calculateCost();
        return patient.getInsuranceInfo().calculatePatientCost(totalCost);
    }
    
    public double calculateInsuranceCost() {
        double totalCost = calculateCost();
        return patient.getInsuranceInfo().calculateInsuranceCost(totalCost);
    }
    
    public void dispense(String pharmacyName, String pharmacistName) {
        this.pharmacyName = pharmacyName;
        this.pharmacistName = pharmacistName;
        this.dispensedDateTime = LocalDateTime.now();
    }
    
    public boolean isDispensed() {
        return dispensedDateTime != null;
    }
}
