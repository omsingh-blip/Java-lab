package _12forloop;

public class ForloopDemo {
    
    public static void main(String[] args) {



        // Example 1: Counting with for loop
        System.out.println("1st example");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }



        // Example 2: Iterating over an array
        System.out.println("\n2nd example");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

}
