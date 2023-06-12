package app;

/**
 * Provides a method to generate an array of odd numbers between two integers.
 *
 * @author Avelino
 */
public class Calculator {

    /**
     * Generates an array of odd numbers between the given start and end
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

        int amountAllNumbers = Math.abs(start - end) - 1;
        int[] allNumbers = new int[amountAllNumbers];

        if (start > end) {
            for (int i = 0; i < amountAllNumbers; i++) {
                allNumbers[i] = --start;
            }
        } else {
            for (int i = 0; i < amountAllNumbers; i++) {
                allNumbers[i] = ++start;
            }
        }

        int amountOddNumbers = 0;
        for (int i = 0; i < amountAllNumbers; i++) {
            if (allNumbers[i] % 2 != 0) {
                amountOddNumbers++;
                continue;
            }
            allNumbers[i] = 0;
        }

        int[] oddNumbers = new int[amountOddNumbers];

        int i = 0;
        int j = 0;

        while (amountOddNumbers != 0 && i < amountAllNumbers) {
            if (allNumbers[i] != 0) {
                oddNumbers[j] = allNumbers[i];
                j++;
            }
            i++;
        }

        return oddNumbers;
    }
}
