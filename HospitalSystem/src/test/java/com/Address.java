package test.java.com;

public record Address(String street, String city, String postalCode) {
	@Override
    public String toString() {
        return String.format("%s, %s, %s", street, city, postalCode);
    }
}

record ContactInfo(String phone, String email) {
    // Compact constructor for validation
    public ContactInfo {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (phone == null || phone.isEmpty()) {
            throw new IllegalArgumentException("Phone number required");
        }
    }
}

record EmergencyContact(String name, String phone, String relationship) {
    @Override
    public String toString() {
        return String.format("%s (%s) - %s", name, relationship, phone);
    }
}

record InsuranceInfo(String provider, String policyNumber, CoverageType coverageType) {
    public double calculatePatientCost(double totalCost) {
        double coveragePercent = coverageType.getCoveragePercentage() / 100.0;
        return totalCost * (1 - coveragePercent);
    }
    
    public double calculateInsuranceCost(double totalCost) {
        double coveragePercent = coverageType.getCoveragePercentage() / 100.0;
        return totalCost * coveragePercent;
    }
}
