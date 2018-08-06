package Section6;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int sum = 0;
            if (number / 10 == 0) {
                sum = number + number;
            } else if (number / 10 != 0) {
                int lastDigit = number % 10;
                while (number > 0) {
                    int firstDigit = number;
                    number = number / 10;
                    sum = firstDigit + lastDigit;
                }
            }
            return sum;

        }
        return -1;
    }
}
