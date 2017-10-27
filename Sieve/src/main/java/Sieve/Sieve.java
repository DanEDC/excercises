package Sieve;

import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
        calculatePrimeNumbers(20);
    }

    public static void calculatePrimeNumbers(int max) {
        int[] array = new int[max];
        for (int i = 0; i < array.length; ++i) {
            array[i] = i;
        }
        for (int i = 2; i < array.length; ++i) {
            for (int j = i + i; j < max; j += i) {
                array[j] = -1;
            }

            {
                System.out.println(Arrays.toString(array));
            }

            for (int j = i; j < max; ++j) {
                array = (int[]) ArrayUtils.removeElement(array, -1);
            }
            {
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
