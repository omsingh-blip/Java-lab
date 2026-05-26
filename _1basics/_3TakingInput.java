import java.util.Scanner;

public class _3TakingInput {
    
    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);

            //Reading String as input

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Hello " + name);


            //Reading integer as input

            System.out.print("Enter your age :");
            int age = scanner.nextInt();

            System.out.println("Your age is " + age);


            //Reading double as input

            System.out.print("Enter your gpa");
            double gpa = scanner.nextDouble();

            System.out.println("Your gpa is " + gpa + " Wow!!");


            //Reading boolean as input

            System.out.print("Are you a student(true/false) : ");
            boolean yes = scanner.nextBoolean();

            System.out.println("You are student: " + yes);




            scanner.close();
        
    }
}
