package Section6Test;

import static org.junit.Assert.assertEquals;

import Section6.FlourPackProblem;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FlourPackProblemTest {

  private int bigCount;
  private int smallCount;
  private int goal;
  boolean isGoalMet;
  public FlourPackProblem flourPackProblem;

  public FlourPackProblemTest(int bigCount, int smallCount, int goal, boolean isGoalMet) {
    this.bigCount = bigCount;
    this.smallCount = smallCount;
    this.goal = goal;
    this.isGoalMet = isGoalMet;
  }

  @Before
  public void setUp() {
    flourPackProblem = new FlourPackProblem();

  }

  @Parameterized.Parameters
  public static Collection numbersToCalculate() {
    return Arrays.asList(new Object[][]{
        {1, 0, 4, false},
        {1, 0, 5, true},
        {0, 5, 4, true},
        {2, 2, 12, true},
        {-3, 2, 12, false},

    });
  }

  @org.junit.Test
  public void shouldTestMethodWithDifferentValues() {

    boolean result = FlourPackProblem.canPack(bigCount, smallCount, goal);

    assertEquals(isGoalMet, result);

  }

}