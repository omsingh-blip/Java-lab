public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        int x = 10, y = 20;

        // AND
        if (x > 5 && y > 15) {
            System.out.println("Both conditions are true");
        }

        // OR
        if (x > 15 || y > 15) {
            System.out.println("At least one condition is true");
        }

        // NOT
        boolean flag = false;
        if (!flag) {
            System.out.println("Flag is false, so !flag is true");
        }
    }
}

