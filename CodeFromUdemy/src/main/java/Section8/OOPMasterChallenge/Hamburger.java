package Section8.OOPMasterChallenge;

public class Hamburger {

  private String breadRollType;
  private String meatType;
  private double baseBurgerPrice;
  private Additions additions;

  public Hamburger(String breadRoll, String meat, double baseBurgerPrice, Additions additions) {
    this.breadRollType = breadRoll;
    this.meatType = meat;
    this.baseBurgerPrice = baseBurgerPrice;
    this.additions = additions;
  }

  public double getBaseBurgerPrice() {
    return baseBurgerPrice;
  }

  public Additions getAdditions() {
    return additions;
  }

  public double hamburgerTotalPrice(Hamburger hamburger) {
    double additionsTotalPrice = 0;
    System.out.println("The burger base price is " + hamburger.getBaseBurgerPrice() + "zl");
    if (hamburger.getAdditions().isLettuce()) {
      additionsTotalPrice += getAdditions().getLettucePrice();
      System.out.println("The burger includes lettuce addition with price -  " + getAdditions().getLettucePrice()
              + "zl");
    }
    if (hamburger.getAdditions().isTomato()) {
      additionsTotalPrice += getAdditions().getTomatoPrice();
      System.out.println("The burger includes tomato addition with price -  " + getAdditions().getTomatoPrice()
              + "zl");
    }
    if (hamburger.getAdditions().isCarrot()) {
      additionsTotalPrice += getAdditions().getLettucePrice();
      System.out.println("The burger includes carrot addition with price -  " + getAdditions().getCarrotPrice()
              + "zl");
    }
    if (hamburger.getAdditions().isOnion()) {
      additionsTotalPrice += getAdditions().getOnionPrice();
      System.out.println("The burger includes onion addition with price -  " + getAdditions().getOnionPrice()
              + "zl");
    }
    double burgerTotalPrice = hamburger.getBaseBurgerPrice() + additionsTotalPrice;

    System.out.println("Total price for burger is " + burgerTotalPrice + "zl");
    return burgerTotalPrice;
  }

}
