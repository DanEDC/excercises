package Section8.OOPMasterChallenge;

public class DeluxeHamburger extends Hamburger {

    private boolean chips;
    private boolean drinks;

    private double chipsPrice = 10.0;
    private double drinksPrice = 7.5;

    public DeluxeHamburger(String breadRoll, String meat, double baseBurgerPrice, Additions additions, boolean chips, boolean drinks) {
        super(breadRoll, meat, baseBurgerPrice, additions);
        this.chips = chips;
        this.drinks = drinks;
        additions.setCarrot(false);
        additions.setLettuce(false);
        additions.setOnion(false);
        additions.setTomato(false);
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrinks() {
        return drinks;
    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getDrinksPrice() {
        return drinksPrice;
    }

    public void deluxeHamburgerTotalPrice(DeluxeHamburger deluxeHamburger) {
        double baseHamburgerTotalPrice = super.hamburgerTotalPrice(deluxeHamburger);
        double deluxeAdditionsTotalPrice = 0;
        if (deluxeHamburger.isChips()) {
            deluxeAdditionsTotalPrice += this.getChipsPrice();
            System.out.println("The deluxe burger includes chips addition with price -  " + this.getChipsPrice()
                    + "zl");
        }
        if (deluxeHamburger.isDrinks()) {
            deluxeAdditionsTotalPrice += this.getDrinksPrice();
            System.out.println("The deluxe burger includes drinks addition with price -  " + this.getDrinksPrice()
                    + "zl");
        }
        double deluxeHamburgerTotalPrice = baseHamburgerTotalPrice + deluxeAdditionsTotalPrice;

        System.out.println("Total price for deluxe burger is " + deluxeHamburgerTotalPrice + "zl");
    }

}
