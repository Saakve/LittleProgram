package app;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of numbersBetween method, of class Calculator.
 *
 * @author Avelino
 */
public class CalculatorTest {

    @Test
    public void startAndEndAreEqual() {
        int[] actual = Calculator.numbersBetween(-9, -9);
        int[] expected = new int[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void differenceBetweenStartAndEndIsOne() {
        int[] actual = Calculator.numbersBetween(100, 101);
        int[] expected = new int[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void startIsGreaterThenEnd() {
        int[] actual = Calculator.numbersBetween(-7, 0);
        int[] expected = {-5, -3, -1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void endIsGreaterThenStart() {
        int[] actual = Calculator.numbersBetween(-5, 5);
        int[] expected = {-3, -1, 1, 3};

        assertArrayEquals(expected, actual);
    }
}
