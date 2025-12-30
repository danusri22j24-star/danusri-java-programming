package RideBookingSystem;

public class Passenger {
    private String destination;
    private String rideType;
    private int rideId;
    private int fare;

    public Passenger(String destination, String rideType){
        this.destination=destination;
        this.rideType=rideType;
    }
    public Passenger(){
        this.destination=this.setDestination();
        this.setRideType()=rideType;
    }
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
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
}
