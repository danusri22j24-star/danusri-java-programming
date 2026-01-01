package DoctorAppointmentSystem;

public class GeneralDoctor extends Doctor{
    public GeneralDoctor(int appointmentId,int consultationFee,Patient patient1){
        this.setAppointmentId(appointmentId);
        this.setConsultationFee(consultationFee);
        this.setPatient(patient1);
    }
}