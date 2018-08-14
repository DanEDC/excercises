package Section6;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers(scanner);
        System.out.println(Arrays.toString(returnedArray));
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(Scanner scanner) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

  public static int findMin(int[] array) {

    int min = Integer.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
      int value = array[i];
      if (value < min) {
        min = value;
      }
    }
    return min;
  }
}
