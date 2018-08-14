package Section6Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import Section6.WhileAndDoWhileLoops;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class WhileAndDoWhileLoopsTest {

  private int firstNumber;
  private int finishNumber;
  private String outputMessage;
  public WhileAndDoWhileLoops whileAndDoWhileLoops;

  public WhileAndDoWhileLoopsTest(int firstNumber, int finishNumber,
      String outputMessage) {
    this.firstNumber = firstNumber;
    this.finishNumber = finishNumber;
    this.outputMessage = outputMessage;
  }

  @org.junit.Test
  public void shouldReturnTrueAsEvenNumber() {

    assertTrue(WhileAndDoWhileLoops.isEvenNumber(16));

  }

  @org.junit.Test
  public void shouldReturnFalseAsNotEvenNumber() {

    assertFalse(WhileAndDoWhileLoops.isEvenNumber(17));

  }

  @Before
  public void setUp() {
    whileAndDoWhileLoops = new WhileAndDoWhileLoops();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {-14, 20, "Even number -12\r\n" + "Even number -10\r\n" + "Even number -8\r\n"
            + "Even number -6\r\n" + "Even number -4\r\n"
            + "Total number of even numbers found is 5"},
        {2, 10,
            "Even number 4\r\n" + "Even number 6\r\n" + "Even number 8\r\n" + "Even number 10\r\n"
                + "Total number of even numbers found is 4"},
        {3, 8, "Even number 4\r\n" + "Even number 6\r\n" + "Even number 8\r\n"
            + "Total number of even numbers found is 3"},
    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    System.setOut(new PrintStream(result));

    WhileAndDoWhileLoops.sumOfFiveEvenNumbers(firstNumber, finishNumber);

    assertEquals(outputMessage, result.toString());

  }

}