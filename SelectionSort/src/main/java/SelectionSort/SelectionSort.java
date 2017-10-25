package SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        Integer[] numbers = {9, 4, 8, 1, 6};
        System.out.println(Arrays.toString(numbers));
        sort(numbers);
    }

    public static void sort(Integer[] numbers) {
        for (int i = 1; i < numbers.length; ++i) {
            int j = i;
            while ((j - 1) >= 0) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
                --j;
                {
                }
                System.out.println(Arrays.toString(numbers));
            }
        }
    }
}