package test.java.com;

public enum Gender {
	MALE, FEMALE, OTHER
}

enum BloodType {
    O_POSITIVE("O+"), O_NEGATIVE("O-"),
    A_POSITIVE("A+"), A_NEGATIVE("A-"),
    B_POSITIVE("B+"), B_NEGATIVE("B-"),
    AB_POSITIVE("AB+"), AB_NEGATIVE("AB-");
    
    private final String display;
    
    BloodType(String display) {
        this.display = display;
    }
    
    public String getDisplay() { return display; }
}

enum CoverageType {
    BASIC(50),         // 50% coverage
    STANDARD(70),      // 70% coverage
    COMPREHENSIVE(80); // 80% coverage
    
    private final int coveragePercentage;
    
    CoverageType(int coveragePercentage) {
        this.coveragePercentage = coveragePercentage;
    }
    
    public int getCoveragePercentage() { return coveragePercentage; }
}

enum MedicationType {
    TABLET(90),        // 90-day validity
    CAPSULE(90),
    LIQUID(90),
    SPRAY(180),        // 180-day validity (emergency meds)
    INJECTION(30),     // 30-day validity (controlled)
    INHALER(180);
    
    private final int validityDays;
    
    MedicationType(int validityDays) {
        this.validityDays = validityDays;
    }
    
    public int getValidityDays() { return validityDays; }
}

enum AppointmentStatus {
    SCHEDULED, COMPLETED, CANCELLED, NO_SHOW
}

enum AppointmentType {
    CONSULTATION(60),      // 60 minutes
    FOLLOW_UP(30),         // 30 minutes
    EMERGENCY(45),
    ROUTINE_CHECKUP(30);
    
    private final int durationMinutes;
    
    AppointmentType(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
    
    public int getDurationMinutes() { return durationMinutes; }
}

enum Specialization {
    CARDIOLOGY, NEUROLOGY, GENERAL_PRACTICE, PEDIATRICS,
    ORTHOPEDICS, DERMATOLOGY, PSYCHIATRY, RADIOLOGY
}
