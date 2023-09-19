package com.example.java.Controlflow.pattern;

/**
 * @author Piyush Rai
 * @date 17/09/23
 * @time 6:27 pm
 */
public class RectanglePrint4into4 {
    public static void main(String[] args) {

        for(int i = 0 ;i<= 4; i++)
        {
            for(int j = 0 ;j <= 4; j++)
            {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
