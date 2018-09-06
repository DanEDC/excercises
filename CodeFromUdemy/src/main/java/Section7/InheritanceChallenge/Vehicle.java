package Section7.InheritanceChallenge;

public class Vehicle {

    private int wheels;
    private int steeringWheel;
    private int numberOfSeats;
    private String engine;
    private int numberOfGears;
    private int speed;

    public Vehicle(int wheels, int steeringWheel, int numberOfSeats, String engine, int numberOfGears, int speed) {
        this.wheels = wheels;
        this.steeringWheel = steeringWheel;
        this.numberOfSeats = numberOfSeats;
        this.engine = engine;
        this.numberOfGears = numberOfGears;
        this.speed = speed;
    }

    public void steering() {
        System.out.println("Vehicle is being steered somehow");
    }

    public void changeGear(int changingGear) {
        System.out.println("Vehicle changed gear by " + changingGear + " gears");

    }

    public boolean moving(int speed) {
        if (speed > 0) {
            System.out.println("Vehicle is moving with " + speed + " speed");
            return true;
        } else if (speed == 0) {
            System.out.println("Vehicle has stopped");
            return true;
        } else {
            System.out.println("Wrong speed number");
            return false;
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

}
