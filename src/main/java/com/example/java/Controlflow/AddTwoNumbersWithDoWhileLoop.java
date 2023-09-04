package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 04/09/23
 * @time 4:19 am
 */
import java.util.Scanner;

public class AddTwoNumbersWithDoWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Variable to control the loop
        boolean repeat = true;

        do {
            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate the sum
            int sum = num1 + num2;

            // Display the result
            System.out.println("The sum is: " + sum);

            // Ask the user if they want to perform the operation again
            System.out.print("Do you want to perform the operation again? (yes/no): ");
            String input = scanner.next();

            // Check if the user wants to repeat the loop
            repeat = input.equalsIgnoreCase("yes");

        } while (repeat);

        // Close the scanner
        scanner.close();
    }
}

