import java.util.Scanner;

public class TempConvDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature value:");
        double temp = sc.nextDouble();

        System.out.println("Convert to (C/F)?");
        char choice = sc.next().charAt(0);

        boolean valid = (choice == 'C' || choice == 'c' || choice == 'F' || choice == 'f');

        if (!valid) {
            System.out.println("Enter a valid choice (C/F)");
            return;
        }

        double converted = (choice == 'C' || choice == 'c')
                ? (temp - 32) * 5 / 9
                : (temp * 9 / 5) + 32;

        String unit = (choice == 'C' || choice == 'c') ? "Celsius" : "Fahrenheit";

        System.out.printf("Converted Temperature: %.2f %s%n", converted, unit);
    }
}
