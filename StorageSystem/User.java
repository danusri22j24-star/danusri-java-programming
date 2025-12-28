package StorageSystem;

public class User extends BasicFunctionalities implements UserInterface{
    private String storageType;
    private int files;

    //Getters
    public String getstorageType(){
        return this.storageType;
    }
    public int getfiles(){
        return this.files;
    }

    //Setters
    public void setstorageType(String storagetype){
        this.storageType=storagetype;
    }
    public void setfiles(int files){
        this.files=files;
    }
}
