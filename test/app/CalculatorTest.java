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
        int[] actual = Calculator.numbersBetween(5, 5);
        int[] expected = new int[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void differenceBetweenStartAndEndIsOne() {
        int[] actual = Calculator.numbersBetween(1, 2);
        int[] expected = new int[0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void startIsGreaterThenEnd() {
        int[] actual = Calculator.numbersBetween(7, 2);
        int[] expected = {6, 5, 4, 3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void endIsGreaterThenStart() {
        int[] actual = Calculator.numbersBetween(-5, 5);
        int[] expected = {-4, -3, -2, -1, 0, 1, 2, 3, 4};

        assertArrayEquals(expected, actual);
    }
}
