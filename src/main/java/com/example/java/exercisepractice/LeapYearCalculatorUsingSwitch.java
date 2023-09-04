package com.example.java.exercisepractice;

/**
 * @author Piyush Rai
 * @date 04/09/23
 * @time 4:13 am
 */
public class LeapYearCalculatorUsingSwitch {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            switch (year % 400) {
                case 0:
                    return true;
                default:
                    switch (year % 100) {
                        case 0:
                            return false;
                        default:
                            switch (year % 4) {
                                case 0:
                                    return true;
                                default:
                                    return false;
                            }
                    }
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isLeapYear(-1600)); // Should return false
        System.out.println(isLeapYear(1600));  // Should return true
        System.out.println(isLeapYear(2017));  // Should return false
        System.out.println(isLeapYear(2000));  // Should return true
    }
}
