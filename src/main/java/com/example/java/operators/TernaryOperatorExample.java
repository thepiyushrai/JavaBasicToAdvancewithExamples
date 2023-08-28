package com.example.java.operators;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int number = 10;

        // Using a ternary operator to determine if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is: " + result);

////  Below code using ifElse controlflow   Start
        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        System.out.println("The number is: " + result);
    //// End
    }

}
