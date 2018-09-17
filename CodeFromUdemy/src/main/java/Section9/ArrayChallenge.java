package Section9;

import java.util.Scanner;

public class ArrayChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] createNewArray = getIntegers();
        //printArray(createNewArray);
        printArray(sortIntegers(createNewArray));

    }

    public static int[] sortIntegers(int[] arrayToSort) {
        int[] newCreatedArray = new int[arrayToSort.length];

        for (int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                newCreatedArray[i] = arrayToSort[i];

            }
        }
        return newCreatedArray;
    }


//    public static int[] sortArray (int [] arrayToSort){
//        for(int i = 1; i<arrayToSort.length; i++){
//            if (arrayToSort[i-1] > arrayToSort[i]){
//                int temp = arrayToSort[i];
//                arrayToSort[i] = arrayToSort[i-1];
//                arrayToSort[i-1] = temp;
//            }
//        }
//      return arrayToSort;
//    }

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
