package Section6;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        minAndMaxInput(scanner);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void minAndMaxInput(Scanner scanner) {
        int minNumber = 0;
        int maxNumber = 0;
        System.out.println("Enter number:");
        while (scanner.hasNextInt()) {
            //System.out.println("Enter number:");
            int number = scanner.nextInt();
            if (number > maxNumber) {
                maxNumber = number;
            } else if (number < minNumber) {
                minNumber = number;
            }
        }

        while (!scanner.hasNextInt()) {
            System.out.print("Minimum number is " + minNumber + ", Maximum number is " + maxNumber);
            break;

        }

    }
}
