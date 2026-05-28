package _16scopeVariables;

class ScopeDemo {
    // Static variable (class-level, shared by all objects)
    static int staticVar = 100;

    // Instance variable (object-level, each object has its own copy)
    int instanceVar = 50;

    void show() {
        // Local variable (method-level, exists only inside this method)
        int localVar = 10;

        // Block scope (only inside this block)
        for (int i = 1; i <= 3; i++) {
            int blockVar = i * 2; // block scope
            System.out.println("Block variable (iteration " + i + "): " + blockVar);
        }

        // Printing all scopes
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}

public class Main {
    public static void main(String[] args) {
        // Accessing static variable directly (no object needed)
        System.out.println("\nAccessing static variable from class: " + ScopeDemo.staticVar);

        // Creating objects
        ScopeDemo obj1 = new ScopeDemo();
        ScopeDemo obj2 = new ScopeDemo();

        // Changing instance variable for obj1
        obj1.instanceVar = 200;

        // Showing values for obj1
        System.out.println("\n--- Object 1 ---");
        obj1.show();

        // Showing values for obj2
        System.out.println("\n--- Object 2 ---");
        obj2.show();

        // Modifying static variable (affects all objects)
        ScopeDemo.staticVar = 999;

        System.out.println("\nAfter modifying static variable:");

        System.out.println("\n--- Object 1 ---");
        obj1.show();
        System.out.println("\n--- Object 2 ---");
        obj2.show();
    }
}
