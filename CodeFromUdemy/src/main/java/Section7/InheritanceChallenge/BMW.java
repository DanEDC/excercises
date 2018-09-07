package Section7.InheritanceChallenge;

public class BMW extends Car {

    private int turboValue;

  public BMW(int turboValue) {
    super("Hatchback", "Grey", true, 1);
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
