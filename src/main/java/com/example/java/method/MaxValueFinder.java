package com.example.java.method;

/**
 * @author Piyush Rai
 * @date 24/02/24
 * @time 11:48 pm
 */
import java.util.Scanner;

public class MaxValueFinder {

    public static void main(String[] args) {
        // Step 1: Ask the user to input integer numbers separated by space
        System.out.println("Enter integer numbers separated by space:");

        // Step 2: Read user input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Step 3: Convert input to array of integers
        int[] intArray = convertInputToArray(input);

        // Step 4: Call the method to find the max value
        int maxValue = findMaxIntInArray(intArray);

        // Step 5: Print the max value to the console
        System.out.println("Max value in the array: " + maxValue);
    }

    // Method to convert user input to an array of integers
    private static int[] convertInputToArray(String input) {
        String[] strArray = input.split(" ");
        int[] intArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        return intArray;
    }

    // Method to find the max value in the array
    public static int findMaxIntInArray(int[] intArray) {
        if (intArray.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = intArray[0];
        for (int num : intArray) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
