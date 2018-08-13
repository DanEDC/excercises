package Section6Test;

import Section6.Sum3And5;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Sum3And5Test {

    private int number;
    private String message;
    public Sum3And5 sum3And5;

    public Sum3And5Test(int number, String message) {
        this.number = number;
        this.message = message;
    }

    @Before
    public void setUp() {
        sum3And5 = new Sum3And5();

    }

    @Parameterized.Parameters
    public static Collection numbersToCalculate() {
        return Arrays.asList(new Object[][]{
                {7, "15\r\n" + "30\r\n" + "45\r\n" + "60\r\n" + "75\r\n" + "Sum of numbers is 225"},
                {50, "60\r\n" + "75\r\n" + "90\r\n" + "105\r\n" + "120\r\n" + "Sum of numbers is 450"},
                {-3, "0\r\n" + "15\r\n" + "30\r\n" + "45\r\n" + "60\r\n" + "Sum of numbers is 150"},
        });
    }

    @org.junit.Test
    public void shouldTestMethodWithDifferentValues() {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        System.setOut(new PrintStream(result));

        Sum3And5.sumOfFactors3And5(number);

        assertEquals(message, result.toString());

    }

}