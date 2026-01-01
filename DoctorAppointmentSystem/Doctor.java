package DoctorAppointmentSystem;

public abstract class Doctor {
    private int appointmentId;
    private int consultationFee;
    private Patient patient;

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void bookAppointment(){
        patient.getSymptoms();
        this.consultationFee=500;
        System.out.println("Appointment Booked For");
        System.out.println(this.patient.getSymptoms());
        System.out.println("Consultation Fee:");
        System.out.println(this.consultationFee);
        System.out.println("Appointment Id:");
        System.out.println(this.appointmentId);

    }
}
