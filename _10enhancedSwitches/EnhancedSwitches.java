package _10enhancedSwitches;

import java.util.Scanner;

public class EnhancedSwitches {
    
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the day: ");
            String day = sc.nextLine().toLowerCase();

            switch (day) {

                case "monday","tueseday", "wednesday", "thursday", "friday" ->
                System.out.println("It is a weekday");

                case "saturday", "sunday" ->
                System.out.println("It's a weekend");

                default -> System.out.println( day+ " is not a day");
            }
        }
}
}