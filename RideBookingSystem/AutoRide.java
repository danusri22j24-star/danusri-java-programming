package RideBookingSystem;

public class AutoRide {
    private int rideId;
    private int fare;
    private String destination;

    public AutoRide(){
        this.setRideId()=rideId;
        this.setFare()=fare;
    }
    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void startRide(String destination){
        this.fare=fare*50;
        System.out.println("Ride Started To");
        System.out.println(destination);
    }
}
