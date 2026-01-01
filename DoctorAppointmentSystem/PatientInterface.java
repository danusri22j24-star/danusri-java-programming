package DoctorAppointmentSystem;

public interface PatientInterface {
    public String getSymptoms();
    public void setSymptoms(String symptoms);
    public String getDoctorType();
    public void setDoctorType(String doctorType);
    public GeneralDoctor getGd();
    public void setGd(GeneralDoctor gd);
    public SpecialistDoctor getSd();
    public void setSd(SpecialistDoctor sd);
}
