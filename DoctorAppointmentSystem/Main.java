package DoctorAppointmentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symptoms for patient1:");
        String symptoms = scanner.nextLine();
        System.out.println("Enter doctor type for patient1:");
        String type=scanner.nextLine();
        patient1.setSymptoms(symptoms);
        patient1.setDoctorType(type);

        System.out.println("Enter symptoms for patient2:");
        String symptoms1 = scanner.nextLine();
        System.out.println("Enter doctor type for patient1:");
        String type1=scanner.nextLine();
        patient2.setSymptoms(symptoms1);
        patient2.setDoctorType(type1);

        if(patient1.getDoctorType()=="General"){
            GeneralDoctor gd=new GeneralDoctor(12,200,patient1);
            patient1.setGd(gd);
            gd.bookAppointment();
            System.out.println(patient1.getGd().getConsultationFee());

        }
        if(patient1.getDoctorType()=="Specialist"){
            SpecialistDoctor sd=new SpecialistDoctor(14,500,patient1);
            patient1.setSd(sd);
            sd.bookAppointment();
            System.out.println(patient1.getSd().getConsultationFee());

        }
        if(patient2.getDoctorType()=="General"){
            GeneralDoctor gd=new GeneralDoctor(10,200,patient2);
            patient2.setGd(gd);
            gd.bookAppointment();
            System.out.println(patient2.getGd().getConsultationFee());

        }
        if(patient2.getDoctorType()=="Specialist"){
            SpecialistDoctor sd=new SpecialistDoctor(14,500,patient2);
            patient2.setSd(sd);
            sd.bookAppointment();
            System.out.println(patient2.getSd().getConsultationFee());

        }
    }
}
