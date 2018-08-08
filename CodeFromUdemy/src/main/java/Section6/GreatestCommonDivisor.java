package Section6;

public class GreatestCommonDivisor {

  public static void main(String[] args) {
    System.out.println(getGreatestCommonDivisor(81, 153));
  }

  public static int getGreatestCommonDivisor(int first, int second) {
    if (first >= 10 && second >= 10) {
      int n = 1;
      int commonDivisor = 0;
      if (first > second) {
        while (n <= first) {
          if (first % n == 0 && second % n == 0) {
            commonDivisor = n;
            n++;
          } else {
            n++;
          }
        }
        return commonDivisor;
      }
      if (second > first) {
        while (n <= second) {
          if (first % n == 0 && second % n == 0) {
            commonDivisor = n;
            n++;
          } else {
            n++;
          }
        }
        return commonDivisor;
      }
    }

    return -1;
  }

}
