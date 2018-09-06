package Section7.InheritanceChallenge;

public class Car extends Vehicle {

    private String carBodyType;
    private String carBodyColour;
    private boolean airCondition;
    private int currentGear;


    public Car(int numberOfSeats, String engine, int numberOfGears, int speed, String carBodyType, String carBodyColour,
               boolean airCondition, int currentGear) {
        super(4, 1, numberOfSeats, engine, numberOfGears, speed);
        this.carBodyType = carBodyType;
        this.carBodyColour = carBodyColour;
        this.airCondition = airCondition;
        this.currentGear = currentGear;
    }

    @Override
    public boolean moving(int speed) {
        if (super.moving(speed) && speed <= 300) {
            return true;
        } else {
            return false;
        }
    }

    public void acceleration(int accelerationValue) {
        int newSpeed = super.getSpeed() + accelerationValue;
        if (this.moving(newSpeed)) {
            super.setSpeed(newSpeed);
            this.changeGear(1);
            System.out.println("Car accelerated by " + accelerationValue + " , and now has overall speed " + newSpeed);
        } else {
            System.out.println("The limit of speed has been reached");
        }
    }

    public void decreasing(int decreasingValue) {
        int newSpeed = super.getSpeed() - decreasingValue;
        if (this.moving(newSpeed)) {
            super.setSpeed(newSpeed);
            this.changeGear(-1);
            System.out.println("Car decreased by " + decreasingValue + " , and now has overall speed " + newSpeed);
        } else {
            System.out.println("The car has stopped!");
        }
    }

    @Override
    public void changeGear(int changingGear) {
        super.changeGear(changingGear);
        int newGear = this.getCurrentGear() + changingGear;
        if (newGear <= super.getNumberOfGears() && newGear > 0) {
            this.setCurrentGear(newGear);
            System.out.println("The car is now on " + newGear + " gear");
        } else {
            System.out.println("You cannot change gear by this value");
        }

    }

    public void reverseGear(int reverseSpeed) {
        this.setSpeed(0);
        this.setCurrentGear(-1);
        super.moving(reverseSpeed);
        System.out.println("Car started moving backwards with speed " + reverseSpeed);

    }

    @Override
    public void steering() {
        super.steering();
        System.out.println("Car is using hand steering");
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }


}
