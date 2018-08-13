package Section6Test;

import Section6.SharedDigit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SharedDigitTest {

    @org.junit.Test
    public void shouldReturnTrueAsSharedDigitIsMet() {

        assertTrue(SharedDigit.hasSharedDigit(12, 23));

    }

    @org.junit.Test
    public void shouldReturnTrueAsSharedDigitIsMetToo() {

        assertTrue(SharedDigit.hasSharedDigit(15, 55));

    }

    @org.junit.Test
    public void shouldReturnFalseAsSharedDigitIsNotMet() {

        assertFalse(SharedDigit.hasSharedDigit(12, 99));

    }

    @org.junit.Test
    public void shouldReturnFalseAsNumberIsOutOfBound() {

        assertFalse(SharedDigit.hasSharedDigit(9, 99));

    }
}