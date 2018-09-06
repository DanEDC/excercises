package Section7.InheritanceChallenge;

public class BMW extends Car {

    private int turboValue;

    public BMW(int numberOfSeats, String engine, int numberOfGears, int speed, String carBodyType, String carBodyColour,
               int currentGear, int turboValue) {
        super(numberOfSeats, engine, numberOfGears, speed, carBodyType, carBodyColour, true, currentGear);
        this.turboValue = turboValue;
    }

    @Override
    public void acceleration(int accelerationValue) {
        int turboCharging = getTurboValue() * accelerationValue;
        super.acceleration(turboCharging);
    }

    public int getTurboValue() {
        return turboValue;
    }
}
