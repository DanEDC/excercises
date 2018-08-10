package Section5Test;

import static org.junit.Assert.assertEquals;

import Section5.EqualityPrinter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EqualityPrinterTest {

  public int firstNumber;
  public int secondNumber;
  public int thirdNumber;
  public String message;
  public EqualityPrinter equalityPrinter;

  public EqualityPrinterTest(int firstNumber, int secondNumber, int thirdNumber,
      String message) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.thirdNumber = thirdNumber;
    this.message = message;
  }

  @Before
  public void setUp() {
    equalityPrinter = new EqualityPrinter();
  }

  @Parameterized.Parameters
  public static Collection numbersToCheck() {
    return Arrays.asList(new Object[][]{
        {1, 1, 1, "All numbers are equal"},
        {1, 1, 2, "Neither all are equal or different"},
        {-1, -1, -1, "Invalid Value"},
        {1, 2, 3, "All numbers are different"},
    });
  }

  @Test
  public void shouldTestMethodWithDifferentValues() {
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    System.setOut(new PrintStream(result));
    EqualityPrinter.printEqual(firstNumber, secondNumber, thirdNumber);
    assertEquals(message, result.toString());


  }

}