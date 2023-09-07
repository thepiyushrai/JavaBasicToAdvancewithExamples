package com.example.java.variables;

/**
 * @author Piyush Rai
 * @date 08/09/23
 * @time 12:51 am
 */
public class InstanceVariableExample {
    // Instance variables (also known as member variables)
    String name;
    int age;

    // Constructor
    public InstanceVariableExample(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display information about the object
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create objects of the class
        InstanceVariableExample person1 = new InstanceVariableExample("Alice", 25);
        InstanceVariableExample person2 = new InstanceVariableExample("Bob", 30);

        // Display information about the objects
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}
