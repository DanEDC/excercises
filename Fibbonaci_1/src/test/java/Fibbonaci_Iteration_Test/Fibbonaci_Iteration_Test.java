package Fibbonaci_Iteration_Test;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Fibbonaci_Iteration_Test {

    @Test
    @Parameters({"0,0"})
    public void shouldReturn0When0IsProvided(double n, double expected) {
    }

    @Test
    @Parameters({"7,13"})
    public void shouldReturn13When7IsProvided(double n, double expected) {

    }

    @Test
    @Parameters({"16,987"})
    public void shouldReturn987When16IsProvided(double n, double expected) {

    }
}
