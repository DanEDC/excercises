package Section6;

public class Sum3And5 {

    public static void main(String[] args) {
        sumOfFactors3And5(5);
    }

    public static void sumOfFactors3And5(int number) {

        int count = 0;
        int sum = 0;

        for (int i = number; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
            if (count == 5) {
                System.out.print("Sum of numbers is " + sum);
                break;
            }

        }
    }

}
