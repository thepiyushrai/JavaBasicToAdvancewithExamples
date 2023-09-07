package com.example.java.variables;

/**
 * @author Piyush Rai
 * @date 08/09/23
 * @time 12:54 am
 */
public class ClassVariableExample {
    // Class variable (static variable)
    static int count = 0;

    // Constructor
    public ClassVariableExample() {
        count++; // Increment the class variable count each time an object is created
    }

    // Method to get the count of objects created
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Create objects of the class
        ClassVariableExample obj1 = new ClassVariableExample();
        ClassVariableExample obj2 = new ClassVariableExample();
        ClassVariableExample obj3 = new ClassVariableExample();

        // Access the class variable using the class name
        System.out.println("Number of objects created: " + ClassVariableExample.getCount());
    }
}
