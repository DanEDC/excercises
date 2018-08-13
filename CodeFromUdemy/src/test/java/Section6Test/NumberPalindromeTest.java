package Section6Test;

import Section6.NumberPalindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberPalindromeTest {

    @org.junit.Test
    public void shouldReturnTrueAsPalindromeNumber() {

        assertTrue(NumberPalindrome.isPalindrome(-1221));

    }

    @org.junit.Test
    public void shouldReturnTrueAsPalindromeNumber2() {

        assertTrue(NumberPalindrome.isPalindrome(707));

    }

    @org.junit.Test
    public void shouldReturnFalseAsNotPalindromeNumber1() {

        assertFalse(NumberPalindrome.isPalindrome(11212));

    }
}