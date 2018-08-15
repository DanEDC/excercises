package Section6Test;

import Section6.MinAndMaxInputChallenge;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MinAndMaxInputChallengeTest {

    private String input;
    private String outPut;
    public MinAndMaxInputChallenge minAndMaxInputChallenge;

    public MinAndMaxInputChallengeTest(String input, String outPut) {
        this.input = input;
        this.outPut = outPut;
    }

    @Parameterized.Parameters
    public static Collection numbersToCheck() {
        return Arrays.asList(new Object[][]{
                {"5%n -6%n 70%n 4%n 100%n !%n", "Enter number:\r\n" + "Minimum number is -6, Maximum number is 100"},
                {"290%n -333%n 70%n 48%n 10%n a%n", "Enter number:\r\n" + "Minimum number is -333, Maximum number is 290"},
                {"8%n *%n", "Enter number:\r\n" + "Minimum number is 0, Maximum number is 8"},
                {"!%n", "Enter number:\r\n" + "Minimum number is 0, Maximum number is 0"},

        });
    }

    @Before
    public void setUp() {
        minAndMaxInputChallenge = new MinAndMaxInputChallenge();

    }

    @org.junit.Test
    public void shouldTestMethodWithDifferentValues() {
        ByteArrayInputStream stream = new ByteArrayInputStream(String.format(input).getBytes());
        Scanner scanner = new Scanner(stream);

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        System.setOut(new PrintStream(result));

        MinAndMaxInputChallenge.minAndMaxInput(scanner);

        assertEquals(outPut, result.toString());

    }
}