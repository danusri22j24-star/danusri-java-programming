package DoctorAppointmentSystem;

public class SpecialistDoctor extends Doctor{

    public SpecialistDoctor(int appointmentId,int consultationFee,Patient patient){
        this.setAppointmentId(appointmentId);
        this.setConsultationFee(consultationFee);
        this.setPatient(patient);
    }




}
