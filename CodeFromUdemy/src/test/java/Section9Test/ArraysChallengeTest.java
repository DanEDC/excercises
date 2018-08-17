package Section9Test;

import Section9.ArraysChallenge;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ArraysChallengeTest {
    public ByteArrayOutputStream result;

    @Test
    public void shouldPrintArray() {

        result = new ByteArrayOutputStream();
        System.setOut(new PrintStream(result));

        int[] given = {1, 2, 3, 4, 5, 6};
        ArraysChallenge.printArray(given);

        assertEquals(Arrays.toString(given), result.toString());

    }

    @Test
    public void shouldSortArrayInReverse() {

        int[] given = {6, -4, 9, 1, 77};
        int[] expected = {77, 9, 6, 1, -4};

        int[] sorted = ArraysChallenge.sortArray(given);

        assertEquals(Arrays.toString(expected), Arrays.toString(sorted));
    }

    //test doesn't work - don't know how to pass scanner system.in values into getIntegers method
    @Ignore
    @Test
    public void shouldReturnArrayWithThreeElements() {

        int expected[] = {10, 1, 55};

        ByteArrayInputStream stream = new ByteArrayInputStream(String.format("10%n 1%n 55%n").getBytes());
        Scanner scanner = new Scanner(stream);

        int result[] = ArraysChallenge.getIntegers(3);

        assertEquals(Arrays.toString(expected), Arrays.toString(result));


    }

}