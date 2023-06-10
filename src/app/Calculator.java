package app;

/**
 * Provides a method to generate an array of numbers between two integers.
 *
 * @author Avelino
 */
public class Calculator {

    /**
     * Generates an array of numbers between the given start and end integers
     * (exclusive).
     *
     * @param start starting integer (exclusive)
     * @param end ending integer (exclusive)
     * @return array of numbers between start and end
     */
    public static int[] numbersBetween(int start, int end) {
        if (start - end == 0) {
            return new int[0];
        }

        int amount = Math.abs(start - end) - 1;
        int[] numbers = new int[amount];

        if (start > end) {
            for (int i = 0; i < amount; i++) {
                numbers[i] = --start;
            }
        } else {
            for (int i = 0; i < amount; i++) {
                numbers[i] = ++start;
            }
        }

        return numbers;
    }
}
