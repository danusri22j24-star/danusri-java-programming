package VehicleRentalSystem;

public abstract class BasicFunctionalities implements BasicFunctionalitiesInterface {
    private int vehicleNo;
    private int rent;

    public int getvehicleNo(){
        return this.vehicleNo;
    }
    public int getrent(){
        return this.rent;
    }
    public void setvehicleNo(int vn){
        this.vehicleNo=vn;
    }
    public void setrent(int rent){
        this.rent=rent;
    }


}
