package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.LargestPrime;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LargestPrimeTest {

  private int number;
  private int largestPrimeNumber;
  public LargestPrime largestPrime;

  public LargestPrimeTest(int number, int largestPrimeNumber) {
    this.number = number;
    this.largestPrimeNumber = largestPrimeNumber;
  }

  @Before
  public void setUp() {
    largestPrime = new LargestPrime();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {21, 7},
        {217, 31},
        {0, -1},
        {45, 5},
        {-1, -1},

    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {

    int result = LargestPrime.getLargestPrime(number);

    assertEquals(largestPrimeNumber, result);

  }

}