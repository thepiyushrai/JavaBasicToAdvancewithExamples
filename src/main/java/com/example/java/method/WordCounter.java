package com.example.java.method;

/**
 * @author Piyush Rai
 * @date 03/03/24
 * @time 11:15 am
 */
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Step 1: Ask the user to enter text
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        // Step 2: Call the method to get the amount of words
        int wordCount = getWordsAmount(inputText);

        // Step 3: Print the amount of words to the console
        System.out.println("Amount of words: " + wordCount);
    }

    // Method to get the amount of words in the text
    public static int getWordsAmount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        // Split the text by spaces and count the number of resulting array elements
        String[] words = text.split("\\s+");
        return words.length;
    }
}
