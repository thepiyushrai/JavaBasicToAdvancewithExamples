package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 06/09/23
 * @time 2:38 am
 */
public class SumDivisibleBy3And5 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i; // Add the number to the sum
            }
        }

        System.out.println("Sum of numbers divisible by 3 and 5 between 1 and 1000: " + sum);
    }
}

