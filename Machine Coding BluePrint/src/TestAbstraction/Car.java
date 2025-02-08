package TestAbstraction;

public class Car extends  Vehicle{
    private int noOfDoors;
    public Car() {
        super(4);
    }

    public void startCar(){
        System.out.println("Car has started");
    }
    @Override
    public void makeStartSound() {
        System.out.println("Vroom Vroom");
    }

}
