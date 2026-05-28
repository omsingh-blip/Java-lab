package _7NestedIf;

public class NestedIfElseDemo {

    public static void main(String[] args) {

        // example 1

        String username = "Om";
        String password = "12345";

        if (username.equals("Om")) {
            if (password.equals("12345")) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Wrong Password!");
            }
        } else {
            System.out.println("User not found!");
        }

        
        // example 2

        int marks = 85;

        if (marks >= 50) {
            System.out.println("Pass");

            if (marks >= 75) {
                System.out.println("Distinction");
            } else {
                System.out.println("Average");
            }
        } else {
            System.out.println("Fail");
        }

    }
}
