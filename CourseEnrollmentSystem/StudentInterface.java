package CourseEnrollmentSystem;

public interface StudentInterface {
    public int getDuration();
    public void setDuration(int duration);
    public String getCourseType();
    public void setCourseType(String courseType);
    public OnlineCourse getOnline();
    public void setOnline(OnlineCourse online);
    public OfflineCourse getOffline();
    public void setOffline(OfflineCourse offline);
}
