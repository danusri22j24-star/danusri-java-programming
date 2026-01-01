package CourseEnrollmentSystem;

public class Student implements StudentInterface{
    private int duration;
    private String courseType;
    private OnlineCourse online;
    private OfflineCourse offline;

    public Student(int duration,String courseType){
     this.duration=duration;
     this.courseType=courseType;
    }
    public Student(){

    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public OnlineCourse getOnline() {
        return online;
    }

    public void setOnline(OnlineCourse online) {
        this.online = online;
    }

    public OfflineCourse getOffline() {
        return offline;
    }

    public void setOffline(OfflineCourse offline) {
        this.offline = offline;
    }
}
