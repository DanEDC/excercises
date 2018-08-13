package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.DiagonalStar;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DiagonalStarTest {

  private ByteArrayOutputStream result;

  @Before
  public void setUp() {
    result = new ByteArrayOutputStream();
    System.setOut(new PrintStream(result));
  }

  @Test
  public void shouldPrintSquareStar() {

    DiagonalStar.printSquareStar(5);

    String expected = "*****\r\n"
        + "** **\r\n"
        + "* * *\r\n"
        + "** **\r\n"
        + "*****";

    assertEquals(expected, result.toString());
  }

  @Test
  public void shouldReturnInvalidMessage() {

    DiagonalStar.printSquareStar(4);

    assertEquals("Invalid Value", result.toString());

  }

}