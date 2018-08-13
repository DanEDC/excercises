package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.DayOfTheWeek;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DayOfTheWeekTest {

  private ByteArrayOutputStream result;

  @Before
  public void setUp() {
    result = new ByteArrayOutputStream();
    System.setOut(new PrintStream(result));
  }

  @Test
  public void shouldPrintMonday() {

    DayOfTheWeek.printDayOfTheWeek(1);

    assertEquals("Monday", result.toString());
  }

  @Test
  public void shouldPrintErrorMessage() {

    DayOfTheWeek.printDayOfTheWeek(8);

    assertEquals("Invalid number, please type number from 0 to 6", result.toString());
  }

  @Test
  public void shouldPrintSunday() {

    DayOfTheWeek.printDayOfTheWeek2(0);

    assertEquals("Sunday", result.toString());
  }

  @Test
  public void shouldPrintErrorMessage2() {

    DayOfTheWeek.printDayOfTheWeek2(7);

    assertEquals("Invalid number, please type number from 0 to 6", result.toString());
  }

  @Test
  public void shouldPrintNumber() {

    DayOfTheWeek.printNumberInWord(3);

    assertEquals("THREE", result.toString());
  }

  @Test
  public void shouldPrintOther() {

    DayOfTheWeek.printNumberInWord(9999);

    assertEquals("OTHER", result.toString());
  }

}