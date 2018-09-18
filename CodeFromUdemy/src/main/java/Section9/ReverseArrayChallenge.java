package Section9;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

        int[] array = new int[]{7, 5, 4, 3, 2, 1};

        reverse(array);
    }

    public static void reverse(int[] array) {
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[(array.length - 1) - i];
                array[(array.length - 1) - i] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
