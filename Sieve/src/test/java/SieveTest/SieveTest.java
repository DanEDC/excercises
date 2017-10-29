package SieveTest;

import Sieve.Sieve;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SieveTest {

    @Test
    public void shouldSortSimpleArray() throws Exception {
        //given
        Integer max = 10;
        //when
        List<Integer> result = Sieve.calculatePrimeNumbers( 10 );
        //then
        List<Integer> expected = Arrays.asList( 2, 3, 5, 7 );
        assertEquals( expected, result );
    }
}
