package _13breakContinue;

public class Demo {
    
    public static void main(String[] args) {



        // Example 1: Using break in a loop
        System.out.println("1st example");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // exit the loop when i is 5
            }
            System.out.println("Count: " + i);
        }



        
        // Example 2: Using continue in a loop
        System.out.println("\n2nd example");
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println("Odd Count: " + j);
        }
    }
}
