package Section6Test;

import Section6.NumberToWords;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class NumberToWordsTest {

    private ByteArrayOutputStream result;

    @org.junit.Test
    public void shouldReturnNumberOne() {

        int result = NumberToWords.getDigitCount(0);

        assertEquals(1, result);

    }

    @org.junit.Test
    public void shouldReturnNumberThree() {

        int result = NumberToWords.getDigitCount(123);

        assertEquals(3, result);

    }

    @org.junit.Test
    public void shouldReturnNegativeOne() {

        int result = NumberToWords.getDigitCount(-12);

        assertEquals(-1, result);

    }

    @org.junit.Test
    public void shouldReturnNumberFour() {

        int result = NumberToWords.getDigitCount(5200);

        assertEquals(4, result);

    }

    @org.junit.Test
    public void shouldReverseNumber1() {

        int result = NumberToWords.reverse(-121);

        assertEquals(-121, result);

    }

    @org.junit.Test
    public void shouldReverseNumber2() {

        int result = NumberToWords.reverse(1212);

        assertEquals(2121, result);

    }

    @org.junit.Test
    public void shouldReverseNumber3() {

        int result = NumberToWords.reverse(1234);

        assertEquals(4321, result);

    }

    @org.junit.Test
    public void shouldReverseAndReturnNumberOne() {

        int result = NumberToWords.reverse(100);

        assertEquals(1, result);

    }

    @Before
    public void setUp() {
        result = new ByteArrayOutputStream();
        System.setOut(new PrintStream(result));
    }

    @Test
    public void shouldPrintOneTwoThree() {

        NumberToWords.numberToWords(123);

        String expected = "One\r\n" + "Two\r\n" + "Three\r\n";

        assertEquals(expected, result.toString());
    }

    @Test
    public void shouldPrintOneZeroOneZero() {

        NumberToWords.numberToWords(1010);

        String expected = "One\r\n" + "Zero\r\n" + "One\r\n" + "Zero\r\n";

        assertEquals(expected, result.toString());
    }

    @Test
    public void shouldPrintOneAndTripleZero() {

        NumberToWords.numberToWords(1000);

        String expected = "One\r\n" + "Zero\r\n" + "Zero\r\n" + "Zero\r\n";

        assertEquals(expected, result.toString());
    }

    @Test
    public void shouldPrintInvalidValue() {

        NumberToWords.numberToWords(-12);

        assertEquals("Invalid Value", result.toString());
    }
}