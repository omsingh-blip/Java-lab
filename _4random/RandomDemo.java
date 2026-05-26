import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        int number1 = random.nextInt(1, 7);      // 1 to 6
        double number2 = random.nextDouble(1, 11); // 1.0 to <11.0
        boolean isHeads = random.nextBoolean();  // true or false

        System.out.println("number1: " + number1 +
                           "\nnumber2: " + number2 +
                           "\nisHeads: " + isHeads);
    }
}
