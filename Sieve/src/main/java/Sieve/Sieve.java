package Sieve;

import java.util.ArrayList;
import java.util.List;

public class Sieve {
    public static void main(String[] args) {
        calculatePrimeNumbers( 20 );
    }

    public static List<Integer> calculatePrimeNumbers(Integer max) {
        Integer[] array = new Integer[max];
        for (Integer i = 0; i < max; i++) {
            array[i] = i;
        }
        for (Integer i = 2; i < max; i++) {
            for (Integer j = i + i; j < max; j += i) {
                array[j] = -1;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < array.length; i++) {
            if (array[i] != (-1)) {
                result.add( array[i] );
            }
        }
        System.out.println( result );
        return result;
    }
}
