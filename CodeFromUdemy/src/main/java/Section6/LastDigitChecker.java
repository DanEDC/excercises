package Section6;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11, 771, 57));
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= 10 && firstNumber <= 1000 && secondNumber >= 10 && secondNumber <= 1000
                && thirdNumber >= 10 && thirdNumber <= 1000) {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            int thirdNumberLastDigit = thirdNumber % 10;
            if (firstNumberLastDigit == secondNumberLastDigit || firstNumberLastDigit == thirdNumberLastDigit
                    || secondNumberLastDigit == thirdNumberLastDigit) {
                return true;
            } else return false;
        }
        return false;
    }
}

