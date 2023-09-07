package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 08/09/23
 * @time 12:45 am
 */
public class IsEvenCheckerWithWhile {
    public static void main(String[] args) {
        int number = 7; // Change this to the number you want to check

        boolean isEven = isEven(number);

        if (isEven) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    // Function to check if a number is even using a while loop
    public static boolean isEven(int num) {
        while (num >= 2) {
            num -= 2;
        }

        return num == 0;
    }
}
