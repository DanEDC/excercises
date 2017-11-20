import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReadSumWriteTest {


    @Test
    public void shouldSumNumbers() {
        //given
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(40, 50, 68, 72, 100));
        //when
        Integer result = ReadSumWrite.sum(numbers);
        //then
        Integer expected = 330;
        assertEquals(expected, result);
    }
    @Test
    private void shouldWriteNumbersAndSumToFile() throws IOException {
        //given
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(40, 50, 68, 72, 100));
        FileWriter TestWriter = new FileWriter("test.txt");
        //when
        ArrayList result = ReadSumWrite.printComponents(TestWriter, numbers);
        //then
        Arrays.toString expected = 330;
        assertEquals(expected, result);
    }
}
