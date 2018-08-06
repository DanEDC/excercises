package Section6;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(11, 71));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber >= 10 && firstNumber <= 99 && secondNumber >= 10 && secondNumber <= 99) {
            int firstNumberFirstDigit = firstNumber % 10;
            int firstNumberSecondDigit = firstNumber / 10;
            int secondNumberFirstDigit = secondNumber % 10;
            int secondNumberSecondDigit = secondNumber / 10;
            if (firstNumberFirstDigit == secondNumberFirstDigit || firstNumberFirstDigit == secondNumberSecondDigit
                    || firstNumberSecondDigit == secondNumberFirstDigit || firstNumberSecondDigit == secondNumberSecondDigit) {
                return true;
            } else return false;
        }
        return false;
    }
}
