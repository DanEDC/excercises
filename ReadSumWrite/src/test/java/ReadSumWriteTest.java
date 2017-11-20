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
        List<Integer> numbers = new ArrayList<Integer>( Arrays.asList( 40, 50, 68, 72, 100 ) );
        //when
        Integer result = ReadSumWrite.sum( numbers );
        //then
        Integer expected = 330;
        assertEquals( expected, result );
    }

    @Test
    public void shouldWriteNumbersAndSumToFile() throws IOException {
        //given
        List<Integer> numbers = new ArrayList<Integer>( Arrays.asList( 40, 50, 68, 72, 100 ) );
        FileWriter TestWriter = new FileWriter( "test.txt" );
        //when
        //StringBuilder result = new StringBuilder(ReadSumWrite.printComponents(TestWriter, numbers));
        ReadSumWrite.printComponents( TestWriter, numbers );
        String result = numbers.toString();
        //then
        String expected = new String( "[40 + 50 + 68 + 72 + 100 = 330]" );
        TestWriter.close();
        assertEquals( expected, result );
    }
}
