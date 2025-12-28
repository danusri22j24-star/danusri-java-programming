package StorageSystem;

/**
 * This is my StorageSystem
 * ENTITIES:User,CloudStorage,LocalStorage
 * User obj knows storageId,usedSpace,storageType,files
 * CloudStorage knows users storageId and users usedSpace
 * LocalStorage knows users storageId and users usedSpace
 * Both CloudStorage and LocalStorage perform uploading and deletion of files for user
 * CloudStorage perform a unique method named syncDevices
 * LocalStorage perform a unique method named createBackup
 */

public class Main {
    public static void main(String[]args) {
        //Required Information
        UserInterface user = new User();
        CloudStorageInterface cs = new CloudStorage();
        user.setstorageId(1234);
        user.setusedSpace(40);
        user.setstorageType("Cloud Storage");
        user.setfiles(2);

        UserInterface user1 = new User();
        LocalStorageInterface ls = new LocalStorage();
        user1.setstorageId(5678);
        user1.setusedSpace(50);
        user1.setstorageType("Local Storage");
        user1.setfiles(4);

        cs.setstorageId(user.getstorageId());
        cs.setusedSpace(user.getusedSpace());
        ls.setstorageId(user1.getstorageId());
        ls.setusedSpace(user1.getusedSpace());

        //Drama
        if (user.getstorageType()== "Cloud Storage") {
            System.out.println("=====USER1:CLOUD=====");
            cs.uploadFile(user.getfiles());
            cs.syncDevices();
        }
        if (user.getstorageType() == "Local Storage") {
            System.out.println("=====USER1:LOCAL=====");
            ls.uploadFile(user.getfiles());
            ls.createBackup();
        }
        if (user1.getstorageType() == "Cloud Storage") {
            System.out.println("=====USER2:CLOUD=====");
            cs.uploadFile(user1.getfiles());
            cs.syncDevices();
        }
        if (user1.getstorageType() == "Local Storage") {
            System.out.println("=====USER2:LOCAL=====");
            ls.uploadFile(user1.getfiles());
            ls.createBackup();
        }
    }
}
