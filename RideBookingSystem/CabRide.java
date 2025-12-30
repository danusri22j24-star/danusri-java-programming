package RideBookingSystem;

public class CabRide {
    private int rideId;
    private int fare;
    private String destination;

    public CabRide(int rideId,int fare){
        this.rideId=rideId;
        this.fare=fare;
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
        this.fare=fare*100;
        System.out.println("Ride Started To");
        System.out.println(destination);
    }
}
