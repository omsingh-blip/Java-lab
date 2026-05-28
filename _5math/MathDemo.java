import java.util.Scanner;
public class MathDemo {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
            double a,b;
            a= scanner.nextDouble();
            b= scanner.nextDouble();

            System.out.println(Math.PI);
            System.out.println(Math.E);

            System.out.println(Math.pow(a,b));
            System.out.println(Math.abs(-a));
            System.out.println(Math.sqrt(a));
            System.out.println(Math.round(a*0.2));
            System.out.println(Math.ceil(3.14));
            System.out.println(Math.max(a,b));
            System.out.println(Math.min(a, b));

            scanner.close();
        }
    }

