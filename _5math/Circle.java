import java.util.Scanner;

public class Circle {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = scanner.nextDouble();

        double area;
        area= Math.PI* Math.pow(radius, 2);
        System.out.println("area of circle is: "+ area);

        double circumfrence = 2* Math.PI* radius;
        System.out.println("The circumfrence of the circle is: "+ circumfrence);


    }
}
