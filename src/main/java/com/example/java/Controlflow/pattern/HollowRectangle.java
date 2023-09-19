package com.example.java.Controlflow.pattern;

/**
 * @author Piyush Rai
 * @date 18/09/23
 * @time 2:00 am
 */
public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int columns = 10; // Number of columns

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Print '*' only for the first and last rows, and the first and last columns
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print a space for the hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
