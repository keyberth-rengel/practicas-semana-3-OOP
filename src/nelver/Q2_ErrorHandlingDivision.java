package nelver;

import java.util.Scanner;

/// Ejercicio 2: Manejo de errores con división.
/// - Lee dos enteros y realiza división dentro de un try/catch.
/// - Maneja la división entre cero (ArithmeticException).
public class Q2_ErrorHandlingDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Error Handling (Division) ===");
        System.out.print("Enter the first integer: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int denominator = scanner.nextInt();

        // Consumir salto de línea para evitar problemas con lecturas posteriores (si las hubiera)
        scanner.nextLine();

        try {
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero is not allowed.");
        }

        scanner.close();
    }
}