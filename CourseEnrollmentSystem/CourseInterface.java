package CourseEnrollmentSystem;

public interface CourseInterface {
    public int getCourseId();
    public void setCourseId(int courseId);
    public int getFee();
    public void setFee(int fee);
    public void enroll();
    public Student getStudent();
    public void setStudent(Student student);
}
