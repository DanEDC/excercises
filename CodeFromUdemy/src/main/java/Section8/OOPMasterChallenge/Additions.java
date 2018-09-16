package Section8.OOPMasterChallenge;

public class Additions {

    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean onion;

    private double lettucePrice = 2.0;
    private double tomatoPrice = 1.5;
    private double carrotPrice = 1;
    private double onionPrice = 0.5;

    public Additions(boolean lettuce, boolean tomato, boolean carrot, boolean onion) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.onion = onion;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getOnionPrice() {
        return onionPrice;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }
}
