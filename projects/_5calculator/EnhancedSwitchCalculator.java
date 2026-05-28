package projects._5calculator;

// calculator program in Java using enhanced switch that performs +, -, *, /, and ^ (power) between two operands:

import java.util.Scanner;

public class EnhancedSwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            double a = sc.nextDouble();

            System.out.println("Enter operator (+ - * / ^):");
            char op = sc.next().charAt(0);

            System.out.println("Enter second number:");
            double b = sc.nextDouble();

            // Enhanced switch expression
            double result = switch (op) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> {
                    if (b == 0) {
                        System.out.println("Error: Division by zero!");
                        yield Double.NaN; // yield allows block logic
                    }
                    yield a / b;
                }
                case '^' -> Math.pow(a, b);
                default -> {
                    System.out.println("Invalid operator!");
                    yield Double.NaN;
                }
            };

            if (!Double.isNaN(result)) {
                System.out.printf("Result: %.2f%n", result);
            }

            sc.close();
        }
    }
