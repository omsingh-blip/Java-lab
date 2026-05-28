import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

			System.out.println("\nIf Statement");

			System.out.print("Enter your the age");
			int age = scanner.nextInt();

			if (age >= 18) {
			    System.out.println("You are an adult.");
			}

			// IF ELSE STATEMENT
			// Provides an alternative block if the condition is false.

			System.out.println("\nIf-else statment");

			if (age >= 18) {
			    System.out.println("You are an adult.");
			} else {
			    System.out.println("You are a minor.");
			}

			// IF-ELSE LADDER
			// Checks multiple conditions in sequence.

			System.out.println("\nIf-else ladder");

			System.out.print("Enter your score: ");
			int score = scanner.nextInt();

			if (score >= 90) {
			    System.out.println("Grade A");
			} else if (score >= 75) {
			    System.out.println("Grade B");
			} else if (score >= 50) {
			    System.out.println("Grade C");
			} else {
			    System.out.println("Fail");
			}

			// SWITCH STATEMENT
			// Used when you have many possible values for a single variable.

			System.out.println("\nSwitch Statement");

			System.out.print("Enter the day: ");
			int day = scanner.nextInt();

			switch (day) {
			    case 1:
			        System.out.println("Monday");
			        break;
			    case 2:
			        System.out.println("Tuesday");
			        break;
			    case 3:
			        System.out.println("Wednesday");
			        break;
			    case 4:
			        System.out.println("Thursday");
			        break;
			    case 5:
			        System.out.println("Friday");
			        break;
			    case 6:
			        System.out.println("Saturday");
			        break;
			    case 7:
			        System.out.println("Sunday");
			        break;
			    default:
			        System.out.println("only 1 to 7 number is allowed");

			}

            scanner.close();
		}


        // IF STATEMENT
        // Executes a block only if the condition is true.


    }
