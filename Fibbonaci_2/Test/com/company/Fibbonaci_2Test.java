package com.company;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;

import static org.junit.Assert.*;

public class Fibbonaci_2Test {

    @Test
    public void shouldReturn0When0IsProvided() {
        //given

        //when
        int given = new Fibbonaci_2().calculateFibbonaciNumber( 0 );
        //then

        int expected = 0;
        assertEquals( expected, given );
    }

    @Test
    public void shouldReturn1When1IsProvided() {
        //given

        //when
        int given = new Fibbonaci_2().calculateFibbonaciNumber( 1 );
        //then

        int expected = 1;
        assertEquals( expected, given );
    }

    @Test
    public void shouldReturn5When4IsProvided() {
        //given

        //when
        int given = new Fibbonaci_2().calculateFibbonaciNumber( 4 );
        //then

        int expected = 3;
        assertEquals( expected, given );
    }
}