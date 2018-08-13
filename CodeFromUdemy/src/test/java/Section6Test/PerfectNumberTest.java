package Section6Test;

import Section6.PerfectNumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PerfectNumberTest {

    @org.junit.Test
    public void shouldReturnTrueAsSumOfDigitsEqualSix() {

        assertTrue(PerfectNumber.isPerfectNumber(6));

    }

    @org.junit.Test
    public void shouldReturnTrueAsSumOfDigitsEqualTwentyEight() {

        assertTrue(PerfectNumber.isPerfectNumber(28));

    }

    @org.junit.Test
    public void shouldReturnFalseAsSumOfDigitsEqualOne() {

        assertFalse(PerfectNumber.isPerfectNumber(5));

    }

    @org.junit.Test
    public void shouldReturnFalseAsNumberOutOfBound() {

        assertFalse(PerfectNumber.isPerfectNumber(-1));

    }
}