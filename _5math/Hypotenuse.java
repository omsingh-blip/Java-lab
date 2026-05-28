import java.util.Scanner;

public class Hypotenuse{
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double a, b;

        System.out.println("Enter a and b");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        scanner.close();    

        double c = Math.hypot(a, b);
        System.out.println("The hypotenuse of the triangle is: " + c);

        scanner.close();
    }
}
