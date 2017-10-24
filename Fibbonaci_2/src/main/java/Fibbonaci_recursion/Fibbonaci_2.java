package Fibbonaci_recursion;

public class Fibbonaci_2 {

    public int calculateFibbonaciNumber(int i) {
        if (i < 2) {
            return i;
        } else {
            return calculateFibbonaciNumber(i - 1) + calculateFibbonaciNumber(i - 2);
        }
    }

}
