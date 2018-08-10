package Section5Test;

import static org.junit.Assert.assertEquals;

import Section5.SecondsAndMinutesChallenge;


public class SecondsAndMinutesChallengeTest {

  @org.junit.Test
  public void shouldTestMethodWithTwoValues() {

    String result = SecondsAndMinutesChallenge.getDurationString(100, 50);
    assertEquals("1h 40m 50s", result);

  }

  @org.junit.Test
  public void shouldTestMethodWithOneValue() {

    String result = SecondsAndMinutesChallenge.getDurationString(4000);
    assertEquals("1h 6m 40s", result);

  }

  @org.junit.Test
  public void shouldReturnInvalidForTwoValues() {

    String result = SecondsAndMinutesChallenge.getDurationString(20, 61);
    assertEquals("Invalid value", result);

  }

  @org.junit.Test
  public void shouldReturnInvalidForOneValue() {

    String result = SecondsAndMinutesChallenge.getDurationString(-1);
    assertEquals("Invalid value", result);

  }
}