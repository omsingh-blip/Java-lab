package _11whileLoop;

import java.util.Scanner;

public class WhileLoopDemo {
    
    public static void main(String[] args){

        // Example 1: Counting

        System.out.println("1st example");
        int i = 1;

        while (i <= 5) {
            System.out.println("Count: " + i);
            i++; // increment to avoid infinite loop
        }



        // Example 2: User Input Until Exit

        System.out.println("2nd example");
        Scanner sc = new Scanner(System.in);
        String input;

            while (true) {
                System.out.println("Enter text (type 'exit' to quit):");
                input = sc.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    break; // exit loop
                }

                System.out.println("You typed: " + input);
   }

   sc.close();
        }
}
