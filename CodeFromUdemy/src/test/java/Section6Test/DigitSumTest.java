package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.DigitSum;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DigitSumTest {

  private int number;
  private int output;
  public DigitSum digitSum;

  public DigitSumTest(int number, int output) {
    this.number = number;
    this.output = output;
  }

  @Before
  public void setUp() {
    digitSum = new DigitSum();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {113, 5},
        {32, 5},
        {6, -1},
        {-123, -1},

    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {

    int result = DigitSum.sumDigits(number);

    assertEquals(output, result);

  }

}