package TaskManager;

public class Task {
    private String taskDescription;

    public Task(String taskdescription){
        this.taskDescription=taskdescription;
    }
    public String getTaskDescription(){
        return this.taskDescription;
    }
}
