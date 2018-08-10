package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.AllFactors;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AllFactorsTest {

  public int number;
  public String message;
  public AllFactors allFactors;

  public AllFactorsTest(int number, String message) {
    this.number = number;
    this.message = message;
  }

  @Before
  public void setUp() {
    allFactors = new AllFactors();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {6, "1 2 3 6 "},
        {32, "1 2 4 8 16 32 "},
        {10, "1 2 5 10 "},
        {-1, "Invalid Value"},

    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    System.setOut(new PrintStream(result));

    AllFactors.printFactors(number);

    assertEquals(message, result.toString());

  }

}