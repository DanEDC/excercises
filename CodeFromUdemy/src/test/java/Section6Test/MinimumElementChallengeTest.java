package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.MinimumElementChallenge;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class MinimumElementChallengeTest {

  public ByteArrayInputStream result;


  @Test
  public void shouldReturnLeastValueFromArray() {

    int given[] = {0, -1, -5, 20, 77};

    int result = MinimumElementChallenge.findMin(given);

    assertEquals(-5, result);

  }

//  @Test
//  public void shouldReturnArrayWith5RandomElements(){
//
//    String input = "1";
//    int expected [] = {1};
//
//    System.setIn(new ByteArrayInputStream(input.getBytes()));
//
//    ByteArrayOutputStream baos = new ByteArrayOutputStream();
//    PrintStream ps = new PrintStream(baos);
//    System.setOut(ps);
//
//    int [] result = MinimumElementChallenge.readIntegers(1);
//
//
//
//    //int [] result = MinimumElementChallenge.readIntegers(5);
//
//    assertEquals (expected, result.toString());
//

//    Scanner scanner = new Scanner(System.setIn(new ByteArrayInputStream(data2.getBytes())));
//
//    String data2 = "1 2 3 4 5";
//    System.setIn(new ByteArrayInputStream(data2.getBytes()));
//
//
//    int expected [] = {1, 2, 3, 4, 5};
//
//    MinimumElementChallenge.readIntegers(5);
//
//    //int [] result = MinimumElementChallenge.readIntegers(5);
//
//    assertEquals (expected, );

}

