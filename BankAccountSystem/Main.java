package BankAccountSystem;

import java.util.Objects;

public class Main {
    public static void main(String[]args){
        UserInterface user=new User();
        UserInterface user1=new User();
        BasicFunctionalitiesInterface savingsaccount=new SavingsAccount();
        BasicFunctionalitiesInterface currentaccount=new CurrentAccount();
        user.setaccountType("SavingsAccount");
        user1.setaccountType("CurrentAccount");
        user.setamount(10);
        user.setdepositAmount(20);
        user.setwithdrawAmount(50);
        user.setaccountNumber(123456789);
        savingsaccount.setaccountNumber(user.getaccountNumber());
        currentaccount.setaccountNumber(user.getaccountNumber());
        user.setname("Deposit");
        user1.setname("Credit");
        user1.setamount(15);
        user1.setdepositAmount(30);
        user1.setwithdrawAmount(40);
        user1.setaccountNumber(123456789);
        savingsaccount.setaccountNumber(user1.getaccountNumber());
        currentaccount.setaccountNumber(user1.getaccountNumber());
        user.operation();
        savingsaccount.setbalance(user.operation());
        currentaccount.setbalance(user.operation());

        if(user.getaccountType()=="Savings Account"){
            System.out.println("USER1:SAVINGS");
            System.out.println("Deposited:");
            System.out.println(user.getdepositAmount());
            System.out.println("balance:");
            System.out.println(savingsaccount.getbalance());
            System.out.println("Fixed Deposit Created");
        }
        if(user1.getaccountType()=="Savings Account"){
            System.out.println("USER1:SAVINGS");
            System.out.println("Deposited:");
            System.out.println(user1.getdepositAmount());
            System.out.println("balance:");
            System.out.println(savingsaccount.getbalance());
            System.out.println("Fixed Deposit Created");
        }
        if(user.getaccountType()=="Current Account"){
            System.out.println("USER2:CURRENT");
            System.out.println("Deposited:");
            System.out.println(user.getdepositAmount());
            System.out.println("balance:");
            System.out.println(currentaccount.getbalance());
            System.out.println("Overdraft Enabled");
        }
        if(user1.getaccountType()=="Current Account"){
            System.out.println("USER2:CURRENT");
            System.out.println("Deposited:");
            System.out.println(user1.getdepositAmount());
            System.out.println("balance:");
            System.out.println(currentaccount.getbalance());
            System.out.println("Overdraft Enabled");
        }

    }
}
