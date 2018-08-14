package Section6;

public class DigitSum {

    public static void main(String[] args) {
      System.out.println(sumDigits(-123));
    }

    public static int sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number = number / 10;
            }
            return sum;
        }
        return -1;
    }

}

