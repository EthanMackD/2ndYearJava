package test.java.com;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Appointment implements Chargeable {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime dateTime;
    private AppointmentType type;
    private AppointmentStatus status;
    private String room;
    private String reason;
    private String notes;
    private static final double CANCELLATION_FEE = 50.0;
    private static final int CANCELLATION_HOURS_REQUIRED = 24;
    
    public Appointment(String appointmentId, Patient patient, Doctor doctor,
                      LocalDateTime dateTime, AppointmentType type, String room,
                      String reason) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
        this.type = type;
        this.status = AppointmentStatus.SCHEDULED;
        this.room = room;
        this.reason = reason;
    }
    
    // Getters
    public String getAppointmentId() { return appointmentId; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public LocalDateTime getDateTime() { return dateTime; }
    public AppointmentType getType() { return type; }
    public AppointmentStatus getStatus() { return status; }
    public String getRoom() { return room; }
    public String getReason() { return reason; }
    
    public void setNotes(String notes) { this.notes = notes; }
    public String getNotes() { return notes; }
    
    public int getDurationMinutes() {
        return type.getDurationMinutes();
    }
    
    public LocalDateTime getEndTime() {
        return dateTime.plusMinutes(getDurationMinutes());
    }
    
    public boolean canCancelWithoutFee() {
        long hoursUntilAppointment = ChronoUnit.HOURS.between(
            LocalDateTime.now(), dateTime
        );
        return hoursUntilAppointment >= CANCELLATION_HOURS_REQUIRED;
    }
    
    @Override
    public double calculateCost() {
        if (status == AppointmentStatus.CANCELLED && !canCancelWithoutFee()) {
            return CANCELLATION_FEE;
        }
        return 0.0; // Or appointment fee if applicable
    }
    
    public void complete() {
        if (status != AppointmentStatus.SCHEDULED) {
            throw new IllegalStateException("Can only complete scheduled appointments");
        }
        this.status = AppointmentStatus.COMPLETED;
    }
    
    public void cancel() {
        if (status != AppointmentStatus.SCHEDULED) {
            throw new IllegalStateException("Can only cancel scheduled appointments");
        }
        this.status = AppointmentStatus.CANCELLED;
    }
    
    public void markNoShow() {
        if (status != AppointmentStatus.SCHEDULED) {
            throw new IllegalStateException("Can only mark scheduled appointments as no-show");
        }
        this.status = AppointmentStatus.NO_SHOW;
    }
}

