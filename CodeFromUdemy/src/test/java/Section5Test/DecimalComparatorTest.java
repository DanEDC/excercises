package Section5Test;

import static org.junit.Assert.assertEquals;

import Section5.DecimalComparator;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DecimalComparatorTest {

  public double firstNumber;
  public double secondNumber;
  public boolean expectedResult;
  public DecimalComparator decimalComparator;

  public DecimalComparatorTest(double firstNumber, double secondNumber, boolean expectedResult) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.expectedResult = expectedResult;
  }

  @Before
  public void setUp() {
    decimalComparator = new DecimalComparator();
  }

  @Parameterized.Parameters
  public static Collection numbersToCheck() {
    return Arrays.asList(new Object[][]{
        {-3.1756, -3.175, true},
        {3.175, 3.176, false},
        {3.0, 3.0, true},
        {1.000111, 1.000567, true},
    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {
    assertEquals(expectedResult,
        DecimalComparator.areEqualByThreeDecimalPlaces(firstNumber, secondNumber));

  }

}