// WEIGHT CONVERSION PROGRAM

// Declare variables

// welcome message

// prompt for user choice

// option 1 convert lbs to kg
// option 2 convert kg to lbs

// else print not valid choice

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weight, newWeight;
        int choice;

        System.out.println("Welcome to the weight conversion program\nOption 1: lbs to kg\nOption 2: kg to lbs");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();


        if(choice==1 || choice==2){

        if(choice==1){

            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();

            newWeight= weight/2.20462;

            System.out.println("Your weight in kg is: "+ newWeight);
        }
        
        else{

            System.out.print("Enter the weigt in kg: ");
            weight = scanner.nextDouble();

            newWeight = weight*2.20462;

            System.out.println("Your weight in lbs is: "+ newWeight);
        }
    }

    else{
        System.out.println("Enter the valid choice! Run again the program");
    }
        

    }
}
