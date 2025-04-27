public class Bicycle extends Vehicle {
    private boolean hasBell;

    //constructor
    public Bicycle(int speed, double maxFuel, double currentFuel, boolean hasBell) {
        super(speed, maxFuel, currentFuel); //calls superclass constructor
        this.hasBell = hasBell;
    }

    //methods
    public void start() {
        System.out.println("Pedal away!"); //bicycle do not "start" in the same way other vehicles do, so the start method is overwritten
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("ding ding!");
        } else {
            System.out.println("The bike has no bell to ring!");
        }
        //can't ring a bell that does not exist so we have to detect wether there is one
    }

    //getters
    public boolean getHasBell() {
        return hasBell;
    }

    //setters
    public void setHasBell(boolean newHasBell) {
        hasBell = newHasBell;
    }
}