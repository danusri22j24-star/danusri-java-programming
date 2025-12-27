package VehicleRentalSystem;

public interface BikeInterface extends Vehicle {
    public void book(int days);
    public void cancel();
    public String helmetIncluded();
}
