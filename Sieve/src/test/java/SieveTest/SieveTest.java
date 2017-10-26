package SieveTest;

import org.junit.Test;

public class SieveTest {

    @Test
    public void shouldSortSimpleArray() {
        //given
        Integer[] numbers = {9, 4, 8, 1, 6};
        //when
        SelectionSort.sort(numbers);
        //then
        Integer[] expected = {1, 4, 6, 8, 9};
        assertArrayEquals(expected, numbers);
    }


}
