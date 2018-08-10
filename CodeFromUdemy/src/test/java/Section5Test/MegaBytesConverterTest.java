package Section5Test;

import static org.junit.Assert.assertEquals;

import Section5.MegaBytesConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MegaBytesConverterTest {

  public int kiloBytes;
  public String message;
  public MegaBytesConverter megaBytesConverter;

  public MegaBytesConverterTest(int kiloBytes, String message) {
    this.kiloBytes = kiloBytes;
    this.message = message;
  }

  @Before
  public void setUp() {
    megaBytesConverter = new MegaBytesConverter();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {1, "1 KB = 0 MB and 1 KB"},
        {2050, "2050 KB = 2 MB and 2 KB"},
        {125, "125 KB = 0 MB and 125 KB"},
        {-1, "Invalid Value"},

    });
  }

  @Test
  public void shouldTestMethodWithDifferentValues() {
    ByteArrayOutputStream result = new ByteArrayOutputStream();
    System.setOut(new PrintStream(result));

    MegaBytesConverter.printMegaBytesAndKiloBytes(kiloBytes);

    assertEquals(message, result.toString());


  }

}