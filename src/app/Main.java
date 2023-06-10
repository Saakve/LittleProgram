package app;

import java.util.Scanner;

/**
 *
 * @author Avelino
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos números");

        System.out.print("Inicio: ");
        int start = scanner.nextInt();

        System.out.print("Fin: ");
        int end = scanner.nextInt();

        int[] numbers = Calculator.numbersBetween(start, end);

        String result = "";

        for (int i : numbers) {
            result += i + ", ";
        }

        System.out.println(result);
    }
}
