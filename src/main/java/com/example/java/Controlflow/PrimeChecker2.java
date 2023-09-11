package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 09/09/23
 * @time 7:18 pm
 */
public class PrimeChecker2 {
    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

}
