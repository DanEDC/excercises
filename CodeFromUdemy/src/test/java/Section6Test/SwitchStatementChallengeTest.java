package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.SwitchStatementChallenge;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SwitchStatementChallengeTest {

  ByteArrayOutputStream result;

  @Before
  public void setUp() {
    result = new ByteArrayOutputStream();
    System.setOut(new PrintStream(result));
  }

  @Test
  public void shouldCheckMethodForALetter() {

    SwitchStatementChallenge.switchStatement('\u0041');

    String expected = "Char variable A was found";

    assertEquals(expected, result.toString());
  }

  @Test
  public void shouldCheckMethodForDLetter() {

    SwitchStatementChallenge.switchStatement('\u0044');

    String expected = "Char variable D was found";

    assertEquals(expected, result.toString());
  }

  @Test
  public void shouldPrintNothingHasBeenFound() {

    SwitchStatementChallenge.switchStatement('\u0048');

    String expected = "Nothing has been found";

    assertEquals(expected, result.toString());
  }

}