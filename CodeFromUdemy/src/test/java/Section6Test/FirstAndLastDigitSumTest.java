package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.FirstAndLastDigitSum;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FirstAndLastDigitSumTest {

  private int number;
  private int output;
  public FirstAndLastDigitSum firstAndLastDigitSum;

  public FirstAndLastDigitSumTest(int number, int output) {
    this.number = number;
    this.output = output;
  }

  @Before
  public void setUp() {
    firstAndLastDigitSum = new FirstAndLastDigitSum();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {252, 4},
        {257, 9},
        {0, 0},
        {5, 10},
        {-10, -1},

    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {

    int result = FirstAndLastDigitSum.sumFirstAndLastDigit(number);

    assertEquals(output, result);

  }

}