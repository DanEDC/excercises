package Section5;

public class MinutesToYearDaysCalculator {

  public static void main(String[] args) {
    printYearsAndDays(500000);
  }

  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.print("Invalid Value");
    } else {
      int years = (int) ((minutes / (60 * 24) / 365));
      int days = (int) (minutes / (60 * 24) % 365);
      System.out.print(minutes + " min = " + years + " y and " + days + " d");

    }
  }
}
