package Section6;

public class SumOddRange {

    public static void main(String[] args) {
      System.out.println(sumOdd(1, 100));
    }

    public static boolean isOdd(int number) {

        if (number > 0 && number % 2 != 0) {
            return true;

        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
      if (end > 0 && start > 0 && end >= start) {
        for (int i = start; i <= end; i++) {
          if (isOdd(i)) {
            sum += i;
          }
        }
        return sum;
      } else {
        return -1;
      }

    }
}


