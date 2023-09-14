package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 15/09/23
 * @time 1:42 am
 */

    public class LongestSubstring {
        public static int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            int[] charIndex = new int[128]; // Assuming ASCII characters

            for (int right = 0, left = 0; right < s.length(); right++) {
                char currentChar = s.charAt(right);
                left = Math.max(left, charIndex[currentChar]);

                maxLength = Math.max(maxLength, right - left + 1);
                charIndex[currentChar] = right + 1;
            }

            return maxLength;
        }

        public static void main(String[] args) {
            String input = "abcabcbb";
            int result = lengthOfLongestSubstring(input);
            System.out.println("Longest substring without repeating characters: " + result);
        }
    }


