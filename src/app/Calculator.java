package app;

import java.util.ArrayList;

/**
 * Provides a method to generate an array of event numbers between two integers.
 *
 * @author Avelino
 */
public class Calculator {

    /**
     * Generates an array of even numbers between the given start and end
     * integers (exclusive).
     *
     * @param start starting integer (exclusive)
     * @param end ending integer (exclusive)
     * @return array of numbers between start and end
     */
    public static int[] numbersBetween(int start, int end) {
        if (start - end == 0) {
            return new int[0];
        }

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        if (start > end) {
            for (int i = start - 1; i > end; i--) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);
                }
            }
        } else {
            for (int i = start + 1; i < end; i++) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);
                }
            }
        }

        int[] evenNumbersArray = new int[evenNumbers.size()];

        for (int i = 0; i < evenNumbersArray.length; i++) {
            evenNumbersArray[i] = evenNumbers.get(i);
        }

        return evenNumbersArray;
    }
}
