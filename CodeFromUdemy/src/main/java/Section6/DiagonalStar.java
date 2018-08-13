package Section6;

public class DiagonalStar {

  public static void main(String[] args) {
    printSquareStar(20);
  }

  public static void printSquareStar(int number) {
    if (number < 5) {
      System.out.print("Invalid Value");
    } else {
      int n = 1;
      int row = 1;
      int column = 1;
      while (n <= number) {
        if (row == 1) {
          System.out.print("*");
          n++;
          column++;
        }
        if (n == number) {
          System.out.print("*");
          System.out.println();
          row++;
          n = 1;
          column = 1;
        }
        if (row != 1) {
          if (column == 1 || row == column || column == ((number - row) + 1)) {
            System.out.print("*");
            n++;
            column++;
          } else if (row == number) {
            System.out.print("*");
            n++;
            column++;
          } else {
            System.out.print(" ");
            n++;
            column++;
          }
        }
        if (row == number) {
          System.out.print("*");
          n++;
          column++;
          if (column == number && n == number) {
            System.out.print("*");
            break;
          }

        }

      }

    }
  }
}



