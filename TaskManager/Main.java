package TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        User[] UserArray = new User[10];
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome! ");
            System.out.println("Enter UserName: ");
            boolean isExistingUser = false;
            int currentUserPosition = 0;
            String username = scan.nextLine();
            for (int count = 0; count < UserArray.length; count++) {

                if (UserArray[count] == null) {
                    continue;
                }
                User user = UserArray[count];
                String name = user.getUserName();

                if (name.equals(username)) {
                    isExistingUser = true;
                    currentUserPosition = count;
                    break;
                }
            }
            User currentuser;
            if (!isExistingUser) {
                currentuser = new User(username);
                for (int count = 0; count < UserArray.length; count++) {
                    if (UserArray[count] != null) {
                        continue;
                    }
                    UserArray[count] = currentuser;
                    break;
                }
            } else {
                currentuser = UserArray[currentUserPosition];
            }

            Integer choice = 0;//Autoboxing
            while (choice != 5) {//Unboxing
                System.out.print("Welcome ");
                System.out.println(currentuser.getUserName());
                System.out.println("1.Add Task");
                System.out.println("2.List All My Tasks");
                System.out.println("3.Update");
                System.out.println("4.Delete");
                System.out.println("5.Exit");
                System.out.println("Enter your Choice:");
                choice = new Integer(scan.nextLine());
                if (choice == 1) {
                    System.out.println("Enter your Task Description:");
                    String taskdescription = scan.nextLine();
                    Task usertask = new Task(taskdescription);
                    for (int count = 0; count < currentuser.getTaskArray().length; count++) {
                        if (currentuser.getTaskArray()[count] == null) {
                            currentuser.getTaskArray()[count] = usertask;
                            break;
                        }
                    }
                    currentuser.getTaskArray();
                    currentuser.setTaskArray()[0] = usertask;
                    System.out.println("Task added Successfully");
                } else if (choice == 5) {
                    System.out.println("Thankyou!");
                } else if (choice == 2) {
                    boolean isThereAnyTask = false;
                    for (int count = 0; count < currentuser.getTaskArray().length; count++) {
                        if (currentuser.getTaskArray()[count] != null) {

                            String taskdescription = currentuser.getTaskArray()[count].getTaskDescription();
                            System.out.println(taskdescription);
                            isThereAnyTask = true;
                        }
                    }
                    if (isThereAnyTask == false) {
                        System.out.println("No Tasks Identified");
                    }
                } else if (choice == 3) {
                    boolean isThereAnyTask = false;
                    for (int count = 0; count < currentuser.getTaskArray().length; count++) {
                        if (currentuser.getTaskArray()[count] != null) {
                            System.out.print(count + 1);
                            System.out.print(".");
                            System.out.println(currentuser.getTaskArray()[count].getTaskDescription());

                            System.out.println("Enter the Choice to Update");
                            Integer updateChoice = new Integer(scan.nextLine());
                            System.out.println("Enter new Task to update");
                            Task newtask = new Task(scan.nextLine());

                            currentuser.getTaskArray()[updateChoice - 1] = newtask;
                            System.out.println("task updated successfully");
                            isThereAnyTask = true;
                        }
                        }
                    if (isThereAnyTask == false) {
                        System.out.println("no task added to update");
                    }
                } else if (choice == 4) {
                    boolean isThereAnyTask = false;
                    for (int count = 0; count < currentuser.getTaskArray().length; count++) {
                        if (currentuser.getTaskArray()[count] != null) {
                            System.out.print(count + 1);
                            System.out.print(".");
                            System.out.println(currentuser.getTaskArray()[count].getTaskDescription());

                            System.out.println("Enter the Choice to Delete");
                            Integer deleteChoice = new Integer(scan.nextLine());

                            currentuser.getTaskArray()[deleteChoice - 1] = null;
                            System.out.println("task deleted successfully");
                            isThereAnyTask = true;
                        }
                        if (isThereAnyTask == false) {
                            System.out.println("there is no task to delete");
                        }
                    }
                }
            }
        }
    }
    }