package Section8.OOPMasterChallenge;

public class Main {

    public static void main(String[] args) {

        Additions additions = new Additions(true, true, true, true);

        Hamburger hamburger = new Hamburger("White", "Beef", 33, additions);

        hamburger.hamburgerTotalPrice(hamburger);
        System.out.println("--------");

        HealthyBurger healthyBurger = new HealthyBurger("beef", 12, additions, true, true);

        healthyBurger.hamburgerTotalPrice(healthyBurger);
        System.out.println("--------");

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("White", "Beef", 30.0, additions,
                true, false);

        deluxeHamburger.deluxeHamburgerTotalPrice(deluxeHamburger);
        System.out.println("--------");

    }
}
