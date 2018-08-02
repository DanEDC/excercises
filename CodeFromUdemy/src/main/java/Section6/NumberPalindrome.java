package Section6;

public class NumberPalindrome {

  public static void main(String[] args) {
    isPalindrome(11211);
  }

  public static boolean isPalindrome(int number) {
    int reverse = 0;
    int testNumber = number;
    while (testNumber != 0) {
      int lastDigit = testNumber % 10;
      reverse = reverse * 10;
      reverse += lastDigit;
      //System.out.println(reverse);
      testNumber = testNumber / 10;
      //System.out.println(number);
    }
    if (number == reverse) {
      System.out.println(number + " is palindrome number");
      return true;
    } else {
      System.out.println(number + " is NOT palindrome number");
      return false;
    }
  }

}
