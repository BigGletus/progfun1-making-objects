public class Car extends Vehicle {
    private int numberOfDoors;

    //constructor
    public Car(int speed, double maxFuel, double currentFuel, int numberOfDoors) {
        super(speed, maxFuel, currentFuel); //calls superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    //methods
    public void start() {
        super.start();
    }

    public void honk() {
        System.out.println("meep meep!");
    }

    //getters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    //setters
    public void setNumberOfDoors(int newNumberOfDoors) {
        numberOfDoors = newNumberOfDoors;
    }
}