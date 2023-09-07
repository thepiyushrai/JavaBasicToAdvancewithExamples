package com.example.java.variables;

/**
 * @author Piyush Rai
 * @date 08/09/23
 * @time 12:47 am
 */
public class LocalVariableScopeExample {
    public static void main(String[] args) {
        int x = 10; // x is a local variable, accessible within main method

        if (x > 5) {
            int y = 20; // y is a local variable, accessible within the if block
            System.out.println("x is greater than 5");
            System.out.println("y is " + y);
        }

        // Uncommenting the next line would result in a compilation error
        // System.out.println("y is " + y); // y is not accessible here

        // Local variables can be shadowed
        int z = 30; // This variable z is accessible here
        {
            int innerZ = 40; // Use a different name for the inner z variable
            System.out.println("Inner z is " + innerZ); // Inner z is accessible here
        }
        System.out.println("Outer z is " + z); // Outer z is accessible here
    }
}

