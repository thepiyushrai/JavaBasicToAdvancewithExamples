package com.example.java.exercisepractice;

/**
 * @author Piyush Rai
 * @date 02/09/23
 * @time 11:41 pm
 */
public class LeapYearProgram {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isLeapYear(2000));  // Should return true
        System.out.println(isLeapYear(2004));  // Should return true
        System.out.println(isLeapYear(2100));  // Should return false
        System.out.println(isLeapYear(2022));  // Should return false
        System.out.println(isLeapYear(1600));  // Should return true
    }
}
//In this code:
//
//        We first check if the input year is not within the valid range of 1 to 9999.
//        If it's not in this range, we return false.
//        If the year is within the valid range, we use the leap year rules you provided.
//        If the year is evenly divisible by 4 but not by 100, or it's evenly divisible by 400, then it's a leap year, and we return true.
//        Otherwise, we return false.

