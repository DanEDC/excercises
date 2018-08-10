package Section5Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import Section5.BarkingDog;
import org.junit.Test;

public class BarkingDogTest {

  @Test
  public void shouldReturnTrueWhenBarkingAnd1AM() {

    assertTrue(BarkingDog.bark(true, 1));

  }

  @Test
  public void shouldReturnFalseWhenNotBarking() {

    assertFalse(BarkingDog.bark(false, 1));

  }

  @Test
  public void shouldReturnFalseWhenBarkingAnd9AM() {

    boolean result = BarkingDog.bark(true, 9);
    boolean expected = false;
    assertEquals(expected, result);

  }

  @Test
  public void shouldReturnFalseWhenBarkingAndNegativeHour() {

    boolean result = BarkingDog.bark(true, -1);
    boolean expected = false;
    assertEquals(expected, result);

  }
}


