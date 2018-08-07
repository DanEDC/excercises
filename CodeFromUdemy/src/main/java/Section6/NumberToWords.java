package Section6;

public class NumberToWords {

  public static void main(String[] args) {
    numberToWords(201);
    System.out.println(reverse(-2));
  }

  public static void numberToWords(int number) {
    if (number >= 0) {
      int reversedOriginalNumber = reverse(number);
      while (reversedOriginalNumber > 0) {
        int digitToPrint = reversedOriginalNumber % 10;
        switch (digitToPrint) {
          case 0:
            System.out.println("Zero");
            break;
          case 1:
            System.out.println("One");
            break;
          case 2:
            System.out.println("Two");
            break;
          case 3:
            System.out.println("Three");
            break;
          case 4:
            System.out.println("Four");
            break;
          case 5:
            System.out.println("Five");
            break;
          case 6:
            System.out.println("Six");
            break;
          case 7:
            System.out.println("Seven");
            break;
          case 8:
            System.out.println("Eight");
            break;
          case 9:
            System.out.println("Nine");
            break;
        }
        reversedOriginalNumber = reversedOriginalNumber / 10;
      }
      int digitsDifference = getDigitCount(number) - getDigitCount(reverse(number));
      if (digitsDifference != 0) {
        for (int i = 1; i <= digitsDifference; i++) {
          System.out.println("Zero");
        }
      }
    } else {
      System.out.println("Invalid Value");
    }
  }

  public static int reverse(int numberToReverse) {
    int reversedNumber = 0;
    while (numberToReverse != 0) {
      int digit = numberToReverse % 10;
      reversedNumber = reversedNumber * 10;
      reversedNumber += digit;
      numberToReverse = numberToReverse / 10;
    }
    return reversedNumber;
  }

  public static int getDigitCount(int numberToCountDigits) {
    int count = 0;
    if (numberToCountDigits >= 0) {
      do {
        count++;
        numberToCountDigits = numberToCountDigits / 10;
      } while (numberToCountDigits > 0);
      return count;
    } else {
      return -1;
    }
  }
}
