package com.example.java.methodoverloading;

/**
 * @author Piyush Rai
 * @date 03/09/23
 * @time 10:55 am
 */
public class NumberEqualityPrinter {
    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        // Test cases
        printEqual(1, 1, 1);    // Should print "All numbers are equal"
        printEqual(1, 2, 3);    // Should print "All numbers are different"
        printEqual(1, 1, 2);    // Should print "Neither all are equal or different"
        printEqual(-1, -1, -1); // Should print "Invalid Value"
    }
}
