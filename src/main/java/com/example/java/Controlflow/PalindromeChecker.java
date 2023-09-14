package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 12/09/23
 * @time 1:36 am
 */
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        if (isPalindrome(input)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
}

