import java.util.Scanner;

public class Hypotenuse{
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("Enter a and b");
        a = scanner.nextDouble();
        b= scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse of the triangle is: " + c);
    }
}
