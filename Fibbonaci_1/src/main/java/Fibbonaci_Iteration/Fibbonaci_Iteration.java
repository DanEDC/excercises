package Fibbonaci_Iteration;

public class Fibbonaci_Iteration {
    public static void main(String[] args) {

        System.out.println(Fibonacci(46));

    }

    public static double Fibonacci(double n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;

        }

        double prevPrev = 0;
        double prev = 1;
        double result = 0;


        for (int i = 2; i <= n; i++) {
            result = prev + prevPrev;
            prevPrev = prev;
            prev = result;
        }
        return result;
    }

}

