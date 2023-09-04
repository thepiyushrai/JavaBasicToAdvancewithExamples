package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 04/09/23
 * @time 4:21 am
 */
public class ArmstrongNumbersWithWhile {

    public static void main(String[] args) {
        int number = 1;

        while (number <= 500) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }

        return sum == originalNum;
    }
}
