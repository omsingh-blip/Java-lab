// | Specifier | Meaning        | Example Output |
// | ---       | ---            | ---            |
// | %d        | Integer        | ``System.out.printf("%d", 42); → 42 |
// | %f        | Floating-point | ``System.out.printf("%.2f", 3.14159); → 3.14 |
// | %s        | String         | ``System.out.printf("%s", "Hello"); → Hello |
// | %c        | Character      | ``System.out.printf("%c", 'A'); → A|
// | %n        | Newline        | ``System.out.printf("Line1%nLine2"); → Line1 (newline) Line2 |



public class PrintF {
    public static void main(String[] args) {
        int age = 25;
        double pi = Math.PI;
        String name = "Om";

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Pi (2 decimals): %.2f%n", pi);
        System.out.printf("Hex of age: %x%n", age);
    }
}