package DoctorAppointmentSystem;

public interface DoctorInterface {
    public int getAppointmentId();
    public void setAppointmentId(int appointmentId);
    public int getConsultationFee();
    public void setConsultationFee(int consultationFee);
    public Patient getPatient();
    public void setPatient(Patient patient);
    public void bookAppointment();
}