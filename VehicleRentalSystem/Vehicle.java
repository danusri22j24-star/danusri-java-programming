package VehicleRentalSystem;

public abstract class Vehicle extends BasicFunctionalities {
    public void book(int days){
        int rent=this.getrent()*days;
        System.out.println(rent);
    }
    public void cancel(){
        int rent1=this.getrent()-this.getrent();
        System.out.println(rent1);
    }

}
