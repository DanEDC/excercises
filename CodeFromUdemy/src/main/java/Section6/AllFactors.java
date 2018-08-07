package Section6;

public class AllFactors {

  public static void main(String[] args) {
    printFactors(6);
  }

  public static void printFactors(int number) {
    int factor = 1;
    if (number >= 1) {
      while (number >= factor) {
        if (number % factor == 0) {
          System.out.println(factor);
          factor++;
        } else {
          factor++;
        }
      }

    } else {
      System.out.println("Invalid Value");
    }
  }

}
