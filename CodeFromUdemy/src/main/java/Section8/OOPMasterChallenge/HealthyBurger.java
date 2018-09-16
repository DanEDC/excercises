package Section8.OOPMasterChallenge;

public class HealthyBurger extends Hamburger {

    private boolean salad;
    private boolean cucumber;

    private double saladPrice = 3.0;
    private double cucumberPrice = 2.5;

    public HealthyBurger(String meat, double baseBurgerPrice, Additions additions, boolean salad, boolean cucumber) {
        super("Brown Rye Bread", meat, baseBurgerPrice, additions);
        this.salad = salad;
        this.cucumber = cucumber;
    }

    public boolean isSalad() {
        return salad;
    }

    public boolean isCucumber() {
        return cucumber;
    }

    public double getSaladPrice() {
        return saladPrice;
    }

    public double getCucumberPrice() {
        return cucumberPrice;
    }

    public void hamburgerTotalPrice(HealthyBurger healthyBurger) {
        double baseHamburgerTotalPrice = super.hamburgerTotalPrice(healthyBurger);
        double healthyAdditionsTotalPrice = 0;
        if (healthyBurger.isSalad()) {
            healthyAdditionsTotalPrice += this.getSaladPrice();
            System.out.println("The burger includes salad healthy addition with price -  " + this.getSaladPrice()
                    + "zl");
        }
        if (healthyBurger.isCucumber()) {
            healthyAdditionsTotalPrice += this.getCucumberPrice();
            System.out.println("The burger includes cucumber healthy addition with price -  " + this.getCucumberPrice()
                    + "zl");
        }
        double healthyBurgerTotalPrice = baseHamburgerTotalPrice + healthyAdditionsTotalPrice;

        System.out.println("Total price for healthy burger is " + healthyBurgerTotalPrice + "zl");
    }


}
