package test.java.com;

public class Doctor {

	private String name;
	private String medicalCouncilNumber;
	private Specialization specialization;
	private String department;

	public Doctor(String name, String medicalCouncilNumber, Specialization specialization, String department) {
		this.name = name;
		this.medicalCouncilNumber = medicalCouncilNumber;
		this.specialization = specialization;
		this.department = department;
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getMedicalCouncilNumber() {
		return medicalCouncilNumber;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public String getDepartment() {
		return department;
	}
}
