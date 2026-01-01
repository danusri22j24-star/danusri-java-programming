package CourseEnrollmentSystem;

public abstract class Course implements CourseInterface{
    private int courseId;
    private int fee;
    private Student student;


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void enroll(){
        this.fee=student.getDuration()*500;
        System.out.println("Enrolled For");
        System.out.println(this.fee);
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
