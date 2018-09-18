package Section9;

import java.util.Scanner;

public class MinElementChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of Integers");
        int count = scanner.nextInt();

        findMin(readIntegers(count));

    }

    public static int[] readIntegers(int count) {

        int[] newArray = new int[count];
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Enter Integer value");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Minimum integer value inside the array is " + minValue);
        return minValue;
    }
}

