package Section6;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
    }

    public static int getLargestPrime(int number) {
        if (number > 1) {
            int n = 2;
            int largestPrime = 0;
            while (n < number) {
                if ((n == 2 && number % 2 == 0) || ((n == 3 && number % 3 == 0))) {
                    largestPrime = n;
                    n++;
                } else if (n % 2 != 0 && n % 3 != 0 && number % n == 0) {
                    largestPrime = n;
                    n++;
                } else {
                    n++;
                }
            }
            if (largestPrime == 0) {
                largestPrime = number;
            }
            return largestPrime;
        }
        return -1;
    }
}
