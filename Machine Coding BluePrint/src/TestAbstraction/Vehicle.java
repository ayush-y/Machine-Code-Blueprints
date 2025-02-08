package TestAbstraction;

public abstract class Vehicle {
    private int noOfTyres;

    public abstract void makeStartSound();

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }
    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }
    public void getNoOfTyres(){
        System.out.println("No of Tyres: " + this.noOfTyres);
    }
    public void commute(){
        System.out.println("I am Going....");
    }
}
