package Section6;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number > 0) {
            int n = 2;
            while (n <= number) {
                if (isPrimeNumber(n) && number % n == 0) {
                    n++;
                } else n++;
            }
            return n;
        }
        return -1;
    }


    public static boolean isPrimeNumber(int numberToCheck) {
        if (numberToCheck >= 0 && numberToCheck <= 3) {
            return true;
        } else if (numberToCheck > 3) {
            if ((numberToCheck % 2 != 0) && (numberToCheck % 3 != 0)) {
                return true;
            } else return false;
        }
        return false;
    }


}
