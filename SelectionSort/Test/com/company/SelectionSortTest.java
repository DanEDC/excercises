package com.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.company.SelectionSort.sort;
import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void shouldSortSimpleArray() {
        //given
        Integer[] numbers = {9, 4, 8, 1, 6};
        //when
        SelectionSort.sort( numbers );
        //then
        Integer[] expected = {1, 4, 6, 8, 9};
        assertArrayEquals( expected, numbers );
    }

    @Test
    public void shouldSortArrayWith50Elements() {
        //given
        Integer[] numbers = new Integer[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000);
        }
        //when
        SelectionSort.sort( numbers );
        //then
        List<Integer> toSort = Arrays.asList( numbers );
        Collections.sort( toSort );
        Integer[] expected = toSort.toArray( new Integer[0] );
        assertArrayEquals( expected, numbers );
    }
}