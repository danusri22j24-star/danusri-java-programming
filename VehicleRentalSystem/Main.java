package VehicleRentalSystem;

public class Main {
    public static void main(String[]args) {
        Customer customer = new Customer();
        CarInterface car = new Car();
        customer.setvehicleNo(4248);
        customer.setrent(2000);
        customer.setvehicleType("car");
        customer.setrentalDays(5);
        Customer customer1 = new Customer();
        BikeInterface bike = new Bike();
        customer1.setvehicleNo(4343);
        customer1.setrent(1000);
        customer1.setvehicleType("bike");
        customer1.setrentalDays(6);
        Vehicle.setrent(200);
        Vehicle.setrent(300);
        CarInterface.setvehicleNo(customer.getvehicleNo());
        BikeInterface.setvehicleNo(customer.getvehicleNo());

        if(customer.getvehicleType()=="car"){
            System.out.println("Booking Successful");
            System.out.println("Rental Days:");
            System.out.println(customer.getrentalDays());
            System.out.println("rent:");
            System.out.println(carInterface.getrent());
            System.out.println(carInterface.driverIncluded());
        }
        if(customer1.getvehicleType()=="car") {
            System.out.println("Booking Successful");
            System.out.println("Rental Days:");
            System.out.println(customer1.getrentalDays());
            System.out.println("rent:");
            System.out.println(carInterface.getrent());
            System.out.println(carInterface.driverIncluded());
        }
        if(customer.getvehicleType()=="bike") {
            System.out.println("Booking Successful");
            System.out.println("Rental Days:");
            System.out.println(customer.getrentalDays());
            System.out.println("rent:");
            System.out.println(bikeInterface.getrent());
            System.out.println(bikeInterface.helmetIncluded());
        }
        if(customer1.getvehicleType()=="bike") {
            System.out.println("Booking Successful");
            System.out.println("Rental Days:");
            System.out.println(customer1.getrentalDays());
            System.out.println("rent:");
            System.out.println(bikeInterface.getrent());
            System.out.println(bikeInterface.helmetIncluded());
        }
    }
}
