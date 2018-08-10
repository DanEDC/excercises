package Section5Test;

import static org.junit.Assert.assertEquals;

import Section5.MinutesToYearDaysCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MinutesToYearDaysCalculatorTest {

  public int minutes;
  public String message;
  public MinutesToYearDaysCalculator minutesToYearDaysCalculator;

  public MinutesToYearDaysCalculatorTest(int minutes, String message) {
    this.minutes = minutes;
    this.message = message;
  }

  @Before
  public void setUp() {
    minutesToYearDaysCalculator = new MinutesToYearDaysCalculator();

  }

  @Parameterized.Parameters
  public static Collection numbersToCheck() {
    return Arrays.asList(new Object[][]{
        {525600, "525600 min = 1 y and 0 d"},
        {1051200, "1051200 min = 2 y and 0 d"},
        {561600, "561600 min = 1 y and 25 d"},
        {-1, "Invalid Value"},

    });
  }

  @Test
  public void shouldTestMethodWithDifferentValues() {
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    System.setOut(new PrintStream(result));

    MinutesToYearDaysCalculator.printYearsAndDays(minutes);

    assertEquals(message, result.toString());


  }

}