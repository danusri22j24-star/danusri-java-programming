package TaskManager;

public class User {
    private String userName;
    private Task[] taskArray=new Task[10];

    public User(String username){
        this.userName=username;
    }

    public String getUserName(){
        return this.userName;
    }
    public Task[] setTaskArray(){
        return this.taskArray;
    }
    public Task[] getTaskArray(){
        return this.taskArray;
    }
}
