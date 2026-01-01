package DoctorAppointmentSystem;

public class Patient implements PatientInterface{
    private String symptoms;
    private String doctorType;
    private GeneralDoctor gd;
    private SpecialistDoctor sd;

    public Patient(){

    }
    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    public GeneralDoctor getGd() {
        return gd;
    }

    public void setGd(GeneralDoctor gd) {
        this.gd = gd;
    }

    public SpecialistDoctor getSd() {
        return sd;
    }

    public void setSd(SpecialistDoctor sd) {
        this.sd = sd;
    }
}
