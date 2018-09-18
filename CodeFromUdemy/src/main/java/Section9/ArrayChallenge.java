package Section9;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] createNewArray = getIntegers();
      printArray(sortIntegersAscending(createNewArray));
      System.out.println("---");
      printArray(sortIntegersDescending(createNewArray));
      System.out.println("---");
      System.out.println(Arrays.toString(createNewArray));

    }

  public static int[] sortIntegersAscending(int[] arrayToSort) {
    for (int i = 1; i < arrayToSort.length; i++) {
      if (arrayToSort[i - 1] > arrayToSort[i]) {
        int temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[i - 1];
        arrayToSort[i - 1] = temp;
      }
      for (int j = 1; j < arrayToSort.length; j++) {
        if (arrayToSort[j - 1] > arrayToSort[j]) {
          int temp = arrayToSort[j];
          arrayToSort[j] = arrayToSort[j - 1];
          arrayToSort[j - 1] = temp;
        }
      }

    }
    return arrayToSort;
  }

  public static int[] sortIntegersDescending(int[] arrayToSort) {
    for (int i = 0; i < arrayToSort.length - 1; i++) {
      if (arrayToSort[i] < arrayToSort[i + 1]) {
        int temp = arrayToSort[i];
        arrayToSort[i] = arrayToSort[i + 1];
        arrayToSort[i + 1] = temp;
      }
      for (int j = 0; j < arrayToSort.length - 1; j++) {
        if (arrayToSort[j] < arrayToSort[j + 1]) {
          int temp = arrayToSort[j];
          arrayToSort[j] = arrayToSort[j + 1];
          arrayToSort[j + 1] = temp;
        }
      }

    }
    return arrayToSort;
  }


    public static int[] getIntegers() {
        System.out.println("Enter Integer number of array elements");
        int number = scanner.nextInt();
        int[] newArray = new int[number];
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Enter Integer value");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " of array holds Integer value " + array[i]);
        }
    }
}
