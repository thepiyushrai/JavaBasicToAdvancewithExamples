package com.example.java.method;

public class MethodExample {

    // A method that adds two numbers and returns the result
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // Calling the add method
        int result = add(num1, num2);
        System.out.println("Sum: " + result); // Output: Sum: 15
    }
}

