package Section6;

public class PerfectNumber {

  public static void main(String[] args) {
    System.out.println(isPerfectNumber(28));
  }

  public static boolean isPerfectNumber(int number) {
    if (number >= 1) {
      int factor = 1;
      int sum = 0;
      while (number > factor) {
        if (number % factor == 0) {
          sum += factor;
          factor++;
        } else {
          factor++;
        }
      }
      if (number == sum) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }

  }
}
