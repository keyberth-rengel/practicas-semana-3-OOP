package eduardo;

// Ejercicio 1: Sobrecarga de métodos con una clase Calculator.
public class Q1_MethodOverloading {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumTwoInts = calculator.sum(2, 3);
        int sumThreeInts = calculator.sum(1, 2, 3);
        double sumTwoDoubles = calculator.sum(2.5, 3.7);

        System.out.println("Sum of two ints (2 + 3): " + sumTwoInts);
        System.out.println("Sum of three ints (1 + 2 + 3): " + sumThreeInts);
        System.out.println("Sum of two doubles (2.5 + 3.7): " + sumTwoDoubles);
    }
}

class Calculator {

    // Método que acepta dos enteros
    public int sum(int a, int b) {
        return a + b;
    }

    // Método que acepta tres enteros
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Método que acepta dos doubles
    public double sum(double a, double b) {
        return a + b;
    }
}