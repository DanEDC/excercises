package Section5;

public class DecimalComparator {

  public static void main(String[] args) {
    areEqualByThreeDecimalPlaces(3.0125, 3.0120);
  }

  public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
    int convertedFirstNumber = (int) (firstNumber * 1000);
    int convertedSecondNumber = (int) (secondNumber * 1000);
    if (convertedFirstNumber == convertedSecondNumber) {
      System.out.println("True");
      return true;
    } else {
      System.out.println("False");
      return false;
    }

  }

}
