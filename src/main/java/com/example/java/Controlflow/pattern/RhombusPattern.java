package com.example.java.Controlflow.pattern;

/**
 * @author Piyush Rai
 * @date 25/09/23
 * @time 9:20 am
 */
public class RhombusPattern {
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // loop to print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }// printing new line for each row
            System.out.println();
        }
    }


    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
