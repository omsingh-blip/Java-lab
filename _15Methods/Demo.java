package _15Methods;

public class Demo {

    // Method to print a message
    public static void printMessage() {
        System.out.println("Hello, this is a method without parameters!");
    }

    // Method to add two numbers and return the result
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method Returning a String
    public static String fullName(String first, String last) {
        return first + " " + last;
    }

    // Method Overloading (Same name, different parameters)
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Example 1: Calling a method to print a message
        System.out.println("1st example");
        printMessage();



        // Example 2: Calling a method with parameters
        System.out.println("\n2nd example");
        int sum = addNumbers(5, 10);
        System.out.println("Sum: " + sum);



        // Example 3: Calling a method that returns a string
        System.out.println("\n3rd example");
        String name = fullName("John", "Doe");
        System.out.println("Full Name: " + name);


        
        // Example 4: Calling overloaded methods
        System.out.println("\n4th example");
        int product1 = multiply(5, 10);
        double product2 = multiply(5.5, 10.5);
        System.out.println("Product of integers: " + product1);
        System.out.println("Product of doubles: " + product2);
    }
}
