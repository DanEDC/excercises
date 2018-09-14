package Section8.OOPMasterChallenge;

public class Main {

    public static void main(String[] args) {

        Additions additions = new Additions(false, true, false, false);

        Hamburger hamburger = new Hamburger("White", "Beef", 33, additions);

        hamburger.hamburgerTotalPrice(hamburger);

        HealthyBurger healthyBurger = new HealthyBurger("beef", 12, additions, true, true);

        healthyBurger.hamburgerTotalPrice(healthyBurger);


    }
}
