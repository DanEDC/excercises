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
  public void printDayOfTheWeek() {
  }

  @Test
  public void printDayOfTheWeek2() {
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