package test.java.com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String patientId;
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender;
    private BloodType bloodType;
    private LocalDate registrationDate;
    private Address address;
    private ContactInfo contactInfo;
    private EmergencyContact emergencyContact;
    private InsuranceInfo insuranceInfo;
    private List<String> allergies;
    
    public Patient(String patientId, String name, LocalDate dateOfBirth,
                  Gender gender, BloodType bloodType, LocalDate registrationDate,
                  Address address, ContactInfo contactInfo,
                  EmergencyContact emergencyContact, InsuranceInfo insuranceInfo) {
        this.patientId = patientId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.bloodType = bloodType;
        this.registrationDate = registrationDate;
        this.address = address;
        this.contactInfo = contactInfo;
        this.emergencyContact = emergencyContact;
        this.insuranceInfo = insuranceInfo;
        this.allergies = new ArrayList<>();
    }
    
    // Getters
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public Gender getGender() { return gender; }
    public BloodType getBloodType() { return bloodType; }
    public Address getAddress() { return address; }
    public ContactInfo getContactInfo() { return contactInfo; }
    public EmergencyContact getEmergencyContact() { return emergencyContact; }
    public InsuranceInfo getInsuranceInfo() { return insuranceInfo; }
    public List<String> getAllergies() { return allergies; }
    
    public int getAge() {
        return (int) ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
    }
    
    public void addAllergy(String allergy) {
        allergies.add(allergy);
    }
    
    public boolean hasAllergy(String substance) {
        return allergies.stream()
            .anyMatch(allergy -> allergy.equalsIgnoreCase(substance));
    }
}
