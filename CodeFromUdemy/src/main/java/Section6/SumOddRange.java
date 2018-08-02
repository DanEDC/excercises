package Section6;

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd(int number) {

        if (number > 0 && number % 2 != 0) {
            return true;

        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i) && end > 0 && start > 0) {
                sum += i;
            }
            if (end <= 0 || start <= 0) {
                return -1;
            }
        }
        return sum;
    }
}

