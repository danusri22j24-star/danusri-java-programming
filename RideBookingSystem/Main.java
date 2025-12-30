package RideBookingSystem;

public class Main {
    public static void main(String[]args){
        Passenger passenger1=new Passenger("coimbatore","auto");
        Passenger passenger2=new Passenger();
        if(passenger1.getRideType()=="cab"){
            CabRide cr=new CabRide(4248,100);
            cr.startRide(passenger1.getDestination());
            passenger1.setRideId(cr.getRideId());
            passenger1.setFare(cr.getFare());
        }
        if(passenger2.getRideType()=="auto"){
            AutoRide ar=new AutoRide();
            ar.startRide(passenger2.getDestination());
            passenger2.setRideId(ar.getRideId());
            passenger2.setFare(ar.getFare());
        }
        System.out.println(passenger1.getFare());
        System.out.println(passenger1.getRideId());
        System.out.println(passenger2.getFare());
        System.out.println(passenger2.getRideId());
    }
}
