package keyberth;

import java.util.Scanner;

/// Ejercicio 5: Múltiples excepciones + excepción personalizada.
/// - Convierte un String a int (posible NumberFormatException).
/// - Lanza una excepción personalizada si el número es negativo.
public class Q5_MultipleExceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Multiple Exceptions ===");
        System.out.print("Enter an integer number: ");
        String input = scanner.nextLine();

        try {
            // Esto puede lanzar NumberFormatException
            int number = Integer.parseInt(input);

            // Si el número es negativo, lanzamos nuestra excepción personalizada
            if (number < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed: " + number);
            }

            System.out.println("You entered a valid non-negative number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: you must enter a valid integer number.");
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/// Excepción personalizada lanzada cuando el número es negativo.
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
