package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.GreatestCommonDivisor;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class GreatestCommonDivisorTest {

  private int first;
  private int second;
  private int commonDivisor;
  public GreatestCommonDivisor greatestCommonDivisor;

  public GreatestCommonDivisorTest(int first, int second, int commonDivisor) {
    this.first = first;
    this.second = second;
    this.commonDivisor = commonDivisor;
  }

  @Before
  public void setUp() {
    greatestCommonDivisor = new GreatestCommonDivisor();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {25, 15, 5},
        {12, 30, 6},
        {9, 18, -1},
        {81, 153, 9},

    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {

    int result = GreatestCommonDivisor.getGreatestCommonDivisor(first, second);

    assertEquals(commonDivisor, result);

  }

}