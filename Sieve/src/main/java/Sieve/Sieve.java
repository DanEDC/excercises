package Sieve;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class Sieve {
    public static void main(String[] args) {
        calculatePrimeNumbers( 5 );
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
            for (i = 3; i < max; i++) {
                for (Integer j = i + i; j < max; j += i) {
                    array[j] = -1;
                }

                for (Integer j = i; j < max; j++) {
                    array = (Integer[]) ArrayUtils.removeElement( array, 0 );
                    array = (Integer[]) ArrayUtils.removeElement( array, 1 );
                    array = (Integer[]) ArrayUtils.removeElement( array, -1 );
                }
                {
                    System.out.println( Arrays.toString( array ) );
                }

            }
        }
        return null;
    }
}
