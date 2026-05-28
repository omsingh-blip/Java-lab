package _9ternaryOperator;

public class TernaryOperatorDemo {

    public static void main(String[] args) {


        // Example 1: Simple Check
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);



        // Example 2: Inline Math

        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);



        // Example 3: Nested Ternary

        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 75) ? "B" : (score >= 50) ? "C" : "F";
        System.out.println("Grade: " + grade);

    }
}
