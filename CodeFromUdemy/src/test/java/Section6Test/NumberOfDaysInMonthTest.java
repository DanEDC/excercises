package Section6Test;

import Section6.NumberOfDaysInMonth;

import static org.junit.Assert.*;

public class NumberOfDaysInMonthTest {

    @org.junit.Test
    public void shouldReturnTrueWhenLeapYear() {

        assertTrue(NumberOfDaysInMonth.isLeapYear(2016));

    }

    @org.junit.Test
    public void shouldReturnFalseWhenNotLeapYear() {

        assertFalse(NumberOfDaysInMonth.isLeapYear(2018));

    }

    @org.junit.Test
    public void shouldReturnFalseWhenYearOutOfBound() {

        assertFalse(NumberOfDaysInMonth.isLeapYear(10000));

    }

    @org.junit.Test
    public void shouldReturnNumberOfDaysInFebruaryLeapYear() {

        int result = NumberOfDaysInMonth.getDaysInMonth(2, 2016);

        assertEquals(29, result);

    }

    @org.junit.Test
    public void shouldReturnNumberOfDaysInFebruaryNotLeapYear() {

        int result = NumberOfDaysInMonth.getDaysInMonth(2, 2018);

        assertEquals(28, result);

    }

    @org.junit.Test
    public void shouldReturnNegativeOneAsWrongNumber() {

        int result = NumberOfDaysInMonth.getDaysInMonth(13, 2018);

        assertEquals(-1, result);

    }
}