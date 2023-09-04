package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 04/09/23
 * @time 4:18 am
 */
import java.util.Scanner;

public class ReverseDigitsWithForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reverse the digits of the input number
        int reversedNumber = reverseDigits(number);

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }

    // Function to reverse the digits of a number using a for loop
    public static int reverseDigits(int num) {
        int reversedNum = 0;

        // Iterate through each digit of the input number
        for (; num != 0; num /= 10) {
            int digit = num % 10;      // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
        }

        return reversedNum;
    }
}
