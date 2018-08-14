package Section9;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

    public static void main(String[] args) {

        printArray(sortArray(getIntegers(5)));

    }

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] table) {
        System.out.println(Arrays.toString(table));
    }

    public static int[] sortArray(int[] nextTable) {
        int[] sortedArray = new int[nextTable.length];
        for (int i = 0; i < nextTable.length; i++) {
            sortedArray[i] = nextTable[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }
}

