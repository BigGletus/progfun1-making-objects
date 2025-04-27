public class Main {

    public static void main(String args[]) {

        Car camry = new Car(50, 18.5, 18.5, 4);
        camry.start();
        camry.stop();
        camry.displayFuel();
        camry.honk(); //instantiation and testing of all methods for car

        Bicycle bike = new Bicycle(10, 0, 0, false);
        bike.start();
        bike.stop();
        bike.displayFuel();
        bike.ringBell(); //instantiation and testing of all methods for bicycle

        //testing with bell
        bike.setHasBell(true);
        System.out.println("added bell to bike");
        bike.ringBell();

        //testing different fuel levels
        camry.setCurrentFuel(14);
        System.out.println("used up some fuel");
        camry.displayFuel();
    }
}