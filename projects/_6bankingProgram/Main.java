// This program simulates a simple banking system where users can check their balance, deposit money, and withdraw money. The program will continue to run until the user chooses to exit.

//Steps to create the program:
// Declare variables

// display menu

// get and process user input

// showBalance()

// deposit()

// withdraw()

// exit message

package projects._6bankingProgram;

import java.util.Scanner;

public class Main {

    public void showBalance(double balance) {
        System.out.println("Your current balance is: $" + balance);
    }

    public double deposit(double balance, double amount) {
        balance += amount;
        System.out.println("You have deposited: $" + amount);
        return balance;
    }

    public double withdraw(double balance, double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds, withdrawal failed.");
            return balance;
        } else {
            balance -= amount;
            System.out.println("You have withdrawn: $" + amount);
            return balance;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1000.00; // Initial balance
        double depositAmount;
        double withdrawAmount;
        int choice;

        Main bankingProgram = new Main();

        // Main loop
        do {
            // Display menu
            System.out.println("\nWelcome to the Simple Banking Program!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> bankingProgram.showBalance(balance);
                case 2 -> {
                    System.out.print("Enter the amount to deposit: ");
                    depositAmount = scanner.nextDouble();
                    balance = bankingProgram.deposit(balance, depositAmount);
                }
                case 3 -> {
                    System.out.print("Enter the amount to withdraw: ");
                    withdrawAmount = scanner.nextDouble();
                    balance = bankingProgram.withdraw(balance, withdrawAmount);
                }
                case 4 -> System.out.println("Thank you for using the Simple Banking Program!");
                default -> System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();

    }
}