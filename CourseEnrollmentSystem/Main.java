package CourseEnrollmentSystem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Student student1 = new Student(40, "Online");
        Student student2 = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Duration:");
        BigInteger Duration = new BigInteger(scanner.nextLine());
        System.out.println("enter CourseType:");
        String CourseType = scanner.nextLine();
        student2.setDuration(Duration.intValue());
        student2.setCourseType(CourseType);

        if (student1.getCourseType() == "Online") {
            OnlineCourse online = new OnlineCourse(1234, 200);
            student1.setOnline(online);
            online.enroll();
            student1.getOnline().getCourseId();
            student1.getOnline().getFee();
        } else {
            OfflineCourse offline = new OfflineCourse();
            student1.setOffline(offline);
            offline.enroll();
            student1.getOffline().getCourseId();
            student1.getOffline().getFee();
        }
        if (student2.getCourseType() == "Offline") {
            OfflineCourse offline = new OfflineCourse();
            student2.setOffline(offline);
            offline.setCourseId(4567);
            offline.setFee(500);
            offline.enroll();
            student2.getOnline().getCourseId();
            student2.getOnline().getFee();
        } else {
            OnlineCourse online = new OnlineCourse(1234, 200);
            student2.setOnline(online);
            online.setCourseId(4567);
            online.setFee(500);
            online.enroll();
            student2.getOffline().getCourseId();
            student2.getOffline().getFee();
        }
    }
}
