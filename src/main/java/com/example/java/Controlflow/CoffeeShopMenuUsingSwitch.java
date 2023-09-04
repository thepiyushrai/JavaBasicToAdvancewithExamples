package com.example.java.Controlflow;

import java.util.Scanner;

/**
 * @author Piyush Rai
 * @date 04/09/23
 * @time 4:08 am
 */
public class CoffeeShopMenuUsingSwitch {



    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display the coffee shop menu
        System.out.println("Welcome to the Coffee Shop Menu!");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("4. Americano");
        System.out.println("5. Exit");

        // Prompt the user to make a selection
        System.out.print("Please enter your choice (1-5): ");
        int choice = scanner.nextInt();

        // Use a switch statement to process the user's choice
        switch (choice) {
            case 1 ->
                // User selected Espresso
                    System.out.println("You ordered Espresso. Enjoy your coffee!");
            case 2 ->
                // User selected Latte
                    System.out.println("You ordered Latte. Enjoy your coffee!");
            case 3 ->
                // User selected Cappuccino
                    System.out.println("You ordered Cappuccino. Enjoy your coffee!");
            case 4 ->
                // User selected Americano
                    System.out.println("You ordered Americano. Enjoy your coffee!");
            case 5 ->
                // User selected Exit
                    System.out.println("Thank you for visiting our coffee shop. Have a great day!");
            default ->
                // Invalid choice
                    System.out.println("Invalid choice. Please select a valid option (1-5).");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
