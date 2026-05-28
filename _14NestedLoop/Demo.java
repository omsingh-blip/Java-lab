package _14NestedLoop;

public class Demo {
    
    public static void main(String[] args) {

        // Example 1: Nested for loops to print a pattern
        System.out.println("1st example");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after inner loop
        }
}
}