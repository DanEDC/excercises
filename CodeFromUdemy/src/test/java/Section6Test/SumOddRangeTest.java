package Section6Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import Section6.SumOddRange;

public class SumOddRangeTest {

  @org.junit.Test
  public void shouldReturnTrueAsOddNumber() {

    assertTrue(SumOddRange.isOdd(17));

  }

  @org.junit.Test
  public void shouldReturnFalseAsNotOddNumber() {

    assertFalse(SumOddRange.isOdd(8));

  }

  @org.junit.Test
  public void shouldReturnFalseAsNumberIsLessThenZero() {

    assertFalse(SumOddRange.isOdd(-3));

  }

  @org.junit.Test
  public void shouldReturnSum2500() {

    int result = SumOddRange.sumOdd(1, 100);

    assertEquals(2500, result);

  }

  @org.junit.Test
  public void shouldReturnNegativeOne() {

    int result = SumOddRange.sumOdd(-1, 100);

    assertEquals(-1, result);

  }

  @org.junit.Test
  public void shouldReturnZero() {

    int result = SumOddRange.sumOdd(100, 100);

    assertEquals(0, result);

  }

  @org.junit.Test
  public void shouldReturnNegativeOne2() {

    int result = SumOddRange.sumOdd(100, -100);

    assertEquals(-1, result);

  }

  @org.junit.Test
  public void shouldReturnSum247500() {

    int result = SumOddRange.sumOdd(100, 1000);

    assertEquals(247500, result);

  }


}