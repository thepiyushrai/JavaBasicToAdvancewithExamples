package com.example.java.method;

/**
 * @author Piyush Rai
 * @date 24/02/24
 * @time 11:50 pm
 */
import java.util.Scanner;

public class RectanglePrinter {

    public static void main(String[] args) {
        // Step 1: Ask the user to input height of the rectangle
        System.out.println("Enter height of the rectangle:");

        // Step 2: Read user input for height
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        // Step 3: Ask the user to input width of the rectangle
        System.out.println("Enter width of the rectangle:");

        // Step 4: Read user input for width
        int width = scanner.nextInt();

        // Step 5: Call the method to print the rectangle
        printRectangle(height, width);
    }

    // Method to print the rectangle to the console
    public static void printRectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}

