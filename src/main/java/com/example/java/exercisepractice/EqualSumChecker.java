package com.example.java.exercisepractice;

/**
 * @author Piyush Rai
 * @date 02/09/23
 * @time 11:47 pm
 */
public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int sum) {
        return num1 + num2 == sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasEqualSum(1, 2, 3));  // Should return true (1 + 2 = 3)
        System.out.println(hasEqualSum(2, 2, 4));  // Should return true (2 + 2 = 4)
        System.out.println(hasEqualSum(5, 10, 20)); // Should return false (5 + 10 != 20)
    }
}

