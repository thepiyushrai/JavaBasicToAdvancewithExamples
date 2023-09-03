package com.example.java.methodoverloading;

/**
 * @author Piyush Rai
 * @date 03/09/23
 * @time 10:44 am
 */
public class MathOperations {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply two double numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to find the average of three integers
    public double average(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Testing the overloaded methods
        System.out.println("Addition (int): " + math.add(5, 3));
        System.out.println("Addition (double): " + math.add(5.5, 3.5));
        System.out.println("Addition (int, int, int): " + math.add(2, 4, 6));
        System.out.println("Multiplication (int): " + math.multiply(5, 3));
        System.out.println("Multiplication (double): " + math.multiply(5.5, 3.0));
        System.out.println("Average (int): " + math.average(3, 6, 9));
    }
}



//In this code:
//
//        We have created a MathOperations class with several overloaded methods.
//        The methods have the same names (add, multiply, average) but differ in their parameter lists, either in terms of the number of parameters or the types of parameters.
//        We have overloaded the add method to work with both integers and double numbers.
//        The average method calculates the average of three integers and returns a double.
//        In the main method, we create an instance of the MathOperations class and call various overloaded methods with different arguments to demonstrate how method overloading works.
//
//        This example showcases how method overloading allows you to create multiple methods with the same name but different behavior based on the parameters provided.
