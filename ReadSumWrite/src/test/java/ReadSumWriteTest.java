import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

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
        StringWriter TestWriter = new StringWriter();
        //when
        //StringBuilder result = new StringBuilder(ReadSumWrite.printComponents(TestWriter, numbers));
        ReadSumWrite.printComponents( TestWriter, numbers );
        String result = TestWriter.toString();

        //then
        String expected = "[40 + 50 + 68 + 72 + 100 = 330]\n";
        assertEquals( expected, result );
    }
}
