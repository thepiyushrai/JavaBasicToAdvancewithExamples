package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 09/09/23
 * @time 7:02 pm
 */
public class PrimeChecker {
    public static boolean isPrime(int number) {
        // 0 and 1 are not prime numbers
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // The number is divisible by i, so it's not prime
            }
        }

        return true; // If no divisors were found, the number is prime
    }

    public static void main(String[] args) {
        int num = 17; // You can change this to any number you want to check
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
