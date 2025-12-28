package StorageSystem;

public interface UserInterface extends BasicFunctionalitiesInterface {
    public String getstorageType();
    public int getfiles();
    public void setstorageType(String storagetype);
    public void setfiles(int files);
}
