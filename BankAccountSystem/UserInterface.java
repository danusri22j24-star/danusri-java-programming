package BankAccountSystem;

public interface UserInterface {
    public int getamount();
    public int getdepositAmount();
    public int getwithdrawAmount();
    public String getaccountType();
    public int getaccountNumber();
    public String getname();
    public int getbalance();
    public void setamount(int amount);
    public void setdepositAmount(int da);
    public void setwithdrawAmount(int wda);
    public void setaccountType(String at);
    public void setaccountNumber(int an);
    public void setname(String sn);
    public void setbalance(int b);
    public int operation();
}
