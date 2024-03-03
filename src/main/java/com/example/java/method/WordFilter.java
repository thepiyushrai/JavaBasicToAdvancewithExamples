package com.example.java.method;

/**
 * @author Piyush Rai
 * @date 03/03/24
 * @time 11:20 am
 */
import java.util.Scanner;
import java.util.Arrays;

public class WordFilter {
    public static void main(String[] args) {
        // Step 1: Ask the user to enter random words separated by space
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter random words separated by space: ");
        String inputWords = scanner.nextLine();

        // Step 2: Ask the user to enter the minimum length of strings to filter
        System.out.print("Enter minimum length of strings to filter: ");
        int minLength = scanner.nextInt();

        // Step 3: Create an array object from entered words
        String[] words = inputWords.split("\\s+");

        // Step 4: Call the method to filter words by length
        String[] filteredWords = filterWordsByLength(minLength, words);

        // Step 5: Print the filtered array to the console
        System.out.println("Filtered words: " + Arrays.toString(filteredWords));
    }

    // Method to filter words by length
    public static String[] filterWordsByLength(int minLength, String[] words) {
        return Arrays.stream(words)
                .filter(word -> word.length() >= minLength)
                .toArray(String[]::new);
    }
}

