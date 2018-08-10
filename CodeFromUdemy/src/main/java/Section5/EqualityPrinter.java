package Section5;

public class EqualityPrinter {

    public static void main(String[] args) {
        printEqual(-2, 2, 3);
    }

    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber < 0 || secondNumber < 0 || thirdNumber < 0) {
          System.out.print("Invalid Value");
        } else if (firstNumber == secondNumber && secondNumber == thirdNumber) {
          System.out.print("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
          System.out.print("All numbers are different");
        } else {
          System.out.print("Neither all are equal or different");
        }
    }
}

