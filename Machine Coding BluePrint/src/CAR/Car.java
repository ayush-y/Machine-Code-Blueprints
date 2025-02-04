package CAR;

public class Car {
    int noOfwheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;
    Car(String color, float maxSpeed, int noOfSeats){
        noOfwheels = 4;
        this.color = color;
        maxSpeed = 80;
        currentFuelInLitres = 0;
        noOfSeats = 4;
    }
    Car(){
        this("Black", 80, 4);
    }
    public Car start(){
        if(currentFuelInLitres<=0){
            System.out.println("Car is out of fuel");
        }else if(currentFuelInLitres<5){
            System.out.println("Car is running out of fuel");
        }else {
            System.out.println("Car is starting");
        }
        return this; // this is a reference to the current object
    }
    public void drive(){
        System.out.println("Car is driving");
        currentFuelInLitres-=1;
    }
    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres+=currentFuelInLitres;
    }
}
