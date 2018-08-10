package Section6;

public class AllFactors {

  public static void main(String[] args) {
    printFactors(8);
  }

  public static void printFactors(int number) {
    int factor = 1;
    if (number >= 1) {
      while (number >= factor) {
        if (number % factor == 0) {
          System.out.print(factor + " ");
          factor++;
        } else {
          factor++;
        }
      }

    } else {
      System.out.print("Invalid Value");
    }
  }

}
