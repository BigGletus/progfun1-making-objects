public class Vehicle {
    protected int speed;
    private double maxFuel;
    private double currentFuel;

    //constructor
    public Vehicle(int speed, double maxFuel, double currentFuel) {
        this.speed = speed;
        this.maxFuel = maxFuel;
        this.currentFuel = currentFuel;
    }

    //methods
    public void start() {
        System.out.println("The vehicle has started");
    }

    public void stop() {
        System.out.println("The vehicle has stopped");
    }

    public final void displayFuel() {
        if (maxFuel <= 0){
            System.out.println("This vehicle does not use fuel.");
        } else {
            double fuelLevel = 100*(currentFuel/maxFuel);
            fuelLevel = Math.round(fuelLevel*100);
            fuelLevel = fuelLevel/100;
            System.out.println("The fuel level is: " + fuelLevel + "%");
        } 
    }

    //getters
    public int getSpeed() {
        return speed;
    }

    public double getMaxFuel() {
        return maxFuel;
    }
    
    public double getCurrentFuel() {
        return currentFuel;
    }

    //setters
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void setMaxFuel(double newMaxFuel) {
        maxFuel = newMaxFuel;
    }

    public void setCurrentFuel(double newCurrentFuel) {
        currentFuel = newCurrentFuel;
    }
}