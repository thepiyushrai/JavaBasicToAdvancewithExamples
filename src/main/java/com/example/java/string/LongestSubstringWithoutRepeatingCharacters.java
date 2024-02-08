package com.example.java.string;

/**
 * @author Piyush Rai
 * @date 07/02/24
 * @time 12:59 am
 */
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Create a HashMap to store characters and their indices
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        int maxLength = 0;  // Length of the longest substring
        int start = 0;      // Start index of the current substring

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the substring, update the start index
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the character's index in the map
            charIndexMap.put(currentChar, end);

            // Update the maxLength
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}
