package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.LastDigitChecker;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LastDigitCheckerTest {

  private int firstNumber;
  private int secondNumber;
  private int thirdNumber;
  boolean isGoalMet;
  public LastDigitChecker lastDigitChecker;

  public LastDigitCheckerTest(int firstNumber, int secondNumber, int thirdNumber,
      boolean isGoalMet) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.thirdNumber = thirdNumber;
    this.isGoalMet = isGoalMet;
  }

  @Before
  public void setUp() {
    lastDigitChecker = new LastDigitChecker();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {41, 22, 71, true},
        {23, 32, 42, true},
        {9, 99, 999, false},
        {22, 23, 24, false},

    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {

    boolean result = LastDigitChecker.hasSameLastDigit(firstNumber, secondNumber, thirdNumber);

    assertEquals(isGoalMet, result);

  }

}