package Section5Test;

import static org.junit.Assert.assertEquals;

import Section5.PlayingCat;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PlayingCatTest {

  public boolean summer;
  public int temperature;
  public boolean expected;
  public PlayingCat playingCat;

  public PlayingCatTest(boolean summer, int temperature, boolean expected) {
    this.summer = summer;
    this.temperature = temperature;
    this.expected = expected;
  }

  @Before
  public void setUp() {
    playingCat = new PlayingCat();
  }

  @Parameterized.Parameters
  public static Collection valuesToCheck() {
    return Arrays.asList(new Object[][]{
        {true, 10, false},
        {false, 36, false},
        {false, 35, true},
        {true, 45, true},
    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {
    assertEquals(expected, PlayingCat.isCatPlaying(summer, temperature));

  }

}