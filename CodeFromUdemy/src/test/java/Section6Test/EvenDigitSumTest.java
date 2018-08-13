package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.EvenDigitSum;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EvenDigitSumTest {

  private int number;
  private int output;
  public EvenDigitSum evenDigitSum;

  public EvenDigitSumTest(int number, int output) {
    this.number = number;
    this.output = output;
  }

  @Before
  public void setUp() {
    evenDigitSum = new EvenDigitSum();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {123456789, 20},
        {252, 4},
        {-22, -1},
        {2, 2},

    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {

    int result = EvenDigitSum.getEvenDigitSum(number);

    assertEquals(output, result);

  }

}