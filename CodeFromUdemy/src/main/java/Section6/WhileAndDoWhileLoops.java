package Section6;

public class WhileAndDoWhileLoops {

  public static void main(String[] args) {
    sumOfFiveEvenNumbers(3, 8);
  }

  public static void sumOfFiveEvenNumbers(int startNumber, int finishNumber) {

    int count = 0;

    while (startNumber <= finishNumber) {
      startNumber++;
      if (!isEvenNumber(startNumber)) {
        continue;
      }
      System.out.println("Even number " + startNumber);
      count++;
      if (count == 5) {
        break;
      }
    }

    System.out.print("Total number of even numbers found is " + count);

  }


  public static boolean isEvenNumber(int number) {
    if (number % 2 == 0) {
      return true;
    } else return false;
  }
}
