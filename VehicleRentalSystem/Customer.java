package VehicleRentalSystem;

public class Customer extends BasicFunctionalities implements CustomerInterface{
    private String vehicleType;
    private int rentalDays;

    public String getvehicleType(){
        return this.vehicleType;
    }
    public int getrentalDays(){
        return this.rentalDays;
    }
    public void setvehicleType(String vt){
        this.vehicleType=vt;
    }
    public void setrentalDays(int rd){
        this.rentalDays=rd;
    }
}
