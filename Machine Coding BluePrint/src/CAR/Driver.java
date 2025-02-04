package CAR;

public class Driver {
    static int minAgeForDriving = 18;
    static String name;
    static String dateOfDrivingLicense;
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.currentFuelInLitres = 10;
//        myCar.drive();
//        System.out.println(myCar.currentFuelInLitres);
        Car swift = new Car("Red", 100, 5);
        swift.addFuel(10);
        swift.color = "Red";
        swift.maxSpeed = 100;
        swift.noOfSeats = 5;
        swift.noOfwheels = 4;
        swift.start().drive();
//        System.out.println("Car's color: "+swift.color);
//        System.out.println("Car's max speed: "+swift.maxSpeed);
//        System.out.println("Car's number of seats: "+swift.noOfSeats);
//        System.out.println("Car's number of wheels: "+swift.noOfwheels);
//        swift.addFuel(10);
//        swift.addFuel(6);
//        swift.start().drive();

//        myDriver.dateOfDrivingLicense = "12/12/2012";
//        System.out.println("Driver's date of driving license: "+Driver.minAgeForDriving);
        System.out.println(swift);
    }
}
