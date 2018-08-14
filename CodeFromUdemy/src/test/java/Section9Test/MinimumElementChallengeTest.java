package Section9Test;

import Section9.MinimumElementChallenge;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MinimumElementChallengeTest {

  @Test
  public void shouldReturnLeastValueFromArray() {

    int given[] = {0, -1, -5, 20, 77};

    int result = MinimumElementChallenge.findMin(given);

    assertEquals(-5, result);

  }

  @Test
  public void shouldReturnArrayWithFiveElements() {

    int expected[] = {6, 70, 4, 100, 333};

    ByteArrayInputStream stream = new ByteArrayInputStream(String.format("5%n 6%n 70%n 4%n 100%n 333%n").getBytes());
    Scanner scanner = new Scanner(stream);

    int result[] = MinimumElementChallenge.readIntegers(scanner);

    assertEquals(Arrays.toString(expected), Arrays.toString(result));


  }

  @Test
  public void shouldReturnArrayWithOneElement() {

    int expected[] = {-12};

    ByteArrayInputStream stream = new ByteArrayInputStream(String.format("1%n -12%n").getBytes());
    Scanner scanner = new Scanner(stream);

    int result[] = MinimumElementChallenge.readIntegers(scanner);

    assertEquals(Arrays.toString(expected), Arrays.toString(result));


  }
}

