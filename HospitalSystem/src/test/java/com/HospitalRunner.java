package test.java.com;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HospitalRunner {
	
	public static void main(String[] args) {
        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===\n");
        
        // Create patient components
        Address address = new Address(
            "78 Green Street",
            "Cork City",
            "T12 XY45"
        );
        
        ContactInfo contact = new ContactInfo(
            "+353 87 234 5678",
            "m.obrien@email.com"
        );
        
        EmergencyContact emergency = new EmergencyContact(
            "MARY O'BRIEN",
            "+353 86 123 4567",
            "SPOUSE"
        );
        
        InsuranceInfo insurance = new InsuranceInfo(
            "VHI Healthcare",
            "VHI-2024-456789",
            CoverageType.COMPREHENSIVE
        );
        
        // Create patient
        Patient patient = new Patient(
            "P-2024-08932",
            "MICHAEL O'BRIEN",
            LocalDate.of(1965, 4, 23),
            Gender.MALE,
            BloodType.O_POSITIVE,
            LocalDate.of(2024, 1, 12),
            address,
            contact,
            emergency,
            insurance
        );
        
        // Add allergies
        patient.addAllergy("Penicillin");
        patient.addAllergy("Peanuts");
        
        // Create doctor
        Doctor doctor = new Doctor(
            "Dr. Sarah Murphy",
            "MC-123456",
            Specialization.CARDIOLOGY,
            "Cardiac Care Unit"
        );
        
        // Create medications
        Medication aspirin = new Medication(
            "Aspirin 75mg",
            MedicationType.TABLET,
            "1 tablet daily",
            "Take with food in morning",
            12.50
        );
        
        Medication lisinopril = new Medication(
            "Lisinopril 10mg",
            MedicationType.TABLET,
            "1 tablet daily",
            "Take in evening",
            18.00
        );
        
        Medication gtnSpray = new Medication(
            "GTN Spray",
            MedicationType.SPRAY,
            "As needed for chest pain",
            "Use under tongue if needed",
            25.00
        );
        
        // Create prescription
        Prescription prescription = new Prescription(
            "RX-2024-10-28-00456",
            patient,
            doctor,
            LocalDateTime.of(2024, 10, 28, 10, 15)
        );
        
        // Add prescription items
        prescription.addItem(new PrescriptionItem(aspirin, 90, 90, 2, false));
        prescription.addItem(new PrescriptionItem(lisinopril, 90, 90, 3, false));
        prescription.addItem(new PrescriptionItem(gtnSpray, 1, 180, 5, true));
        
        // Dispense prescription
        prescription.dispense("Central Pharmacy, Cork", "John Walsh");
        
        // Create appointment
        Appointment appointment = new Appointment(
            "APT-2024-11-15-0089",
            patient,
            doctor,
            LocalDateTime.of(2024, 11, 15, 14, 30),
            AppointmentType.FOLLOW_UP,
            "3-204",
            "Blood pressure monitoring"
        );
        
        // Display information
        System.out.println("PATIENT INFORMATION:");
        System.out.println("ID: " + patient.getPatientId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Type: " + patient.getBloodType().getDisplay());
        System.out.println("Allergies: " + String.join(", ", patient.getAllergies()));
        System.out.println();
        
        System.out.println("PRESCRIPTION INFORMATION:");
        System.out.println("ID: " + prescription.getPrescriptionId());
        System.out.println("Doctor: " + doctor.getName() + " (" + 
                         doctor.getSpecialization() + ")");
        System.out.println("Expires: " + prescription.getExpiryDate());
        System.out.println("Medications: " + prescription.getItems().size());
        System.out.println();
        
        System.out.println("COST BREAKDOWN:");
        System.out.printf("Total Cost: €%.2f%n", prescription.calculateCost());
        System.out.printf("Insurance Covers: €%.2f%n", prescription.calculateInsuranceCost());
        System.out.printf("Patient Pays: €%.2f%n", prescription.calculatePatientCost());
        System.out.println();
        
        System.out.println("APPOINTMENT:");
        System.out.println("ID: " + appointment.getAppointmentId());
        System.out.println("Date/Time: " + appointment.getDateTime());
        System.out.println("Duration: " + appointment.getDurationMinutes() + " minutes");
        System.out.println("Status: " + appointment.getStatus());
        System.out.println("Can cancel without fee: " + appointment.canCancelWithoutFee());
    }

}
