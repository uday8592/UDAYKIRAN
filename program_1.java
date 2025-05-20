import java.util.Scanner;

class Calculator {
    // Method to perform addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to perform division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}

public class program_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Get input from user
        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String operation = scanner.next().toLowerCase();

        double result = 0;
        try {
            // Perform the requested operation
            switch (operation) {
                case "add":
                    result = calculator.add(a, b);
                    break;
                case "subtract":
                    result = calculator.subtract(a, b);
                    break;
                case "multiply":
                    result = calculator.multiply(a, b);
                    break;
                case "divide":
                    result = calculator.divide(a, b);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    return;
            }
            System.out.printf("Result: %.2f\n", result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
