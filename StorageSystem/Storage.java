package StorageSystem;

public abstract class Storage extends BasicFunctionalities implements StorageInterface{
    public void uploadFile(int files){
        int usedSpace=files*100;
        System.out.println("File Uploaded");
        System.out.println("Used Space:");
        System.out.println(usedSpace);
    }
    public void deleteFile(){
        System.out.println("File Deleted");
    }
}
