package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 17/09/23
 * @time 10:25 am
 */
public class FirstLastDigitSum {
    // write your code here
    public static void  main (String[] args) {
        int num = 12345;
        int numb = num/10;
       int sum = sumFirstAndLastDigit(num);
        System.out.println("Sum of the first and last digits: " + sum);
        /* code */
    }

    private static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            number = -number; // Convert negative number to positive
        }
        int lastdigit = number % 10 ;
        while (number >= 10) {
            number /= 10;
            System.out.print(number);
        }

        int firstDigit = number;

        return firstDigit + lastdigit;

    }
}
