package com.example.java.operators;

public class AssignmentVsEqualExample {

        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;

            // Using assignment operator
            int result = num1; // Assigning the value of num1 to result
            System.out.println("result = " + result); // Output: result = 10

            // Using equal to operator
            boolean isEqual = (num1 == num2); // Comparing num1 and num2
            System.out.println("num1 == num2: " + isEqual); // Output: num1 == num2: false
        }
    }


