package StorageSystem;

public class BasicFunctionalities implements BasicFunctionalitiesInterface {
    private int storageId;
    private int usedSpace;

    //Getters
    public int getstorageId(){
        return this.storageId;
    }
    public int getusedSpace(){
        return this.usedSpace;
    }

    //Setters
    public void setstorageId(int storageid){
        this.storageId=storageid;
    }
    public void setusedSpace(int usedspace){
        this.usedSpace=usedspace;
    }
}
