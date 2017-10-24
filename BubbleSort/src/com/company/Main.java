package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {9, 4, 8, 1, 6};
        System.out.println(Arrays.toString(numbers));
        sort(numbers);
    }

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
                System.out.println(Arrays.toString(numbers));
            }
        }
    }
}




