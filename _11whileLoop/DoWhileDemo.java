package _11whileLoop;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
        } while (number <= 0);

        System.out.println("You entered: " + number);
    }
}
