package com.example.java.Controlflow.pattern;

/**
 * @author Piyush Rai
 * @date 21/09/23
 * @time 9:15 am
 */
public class InvertedHalfPyramid {

    public static void main(String[] args) {
        int n = 5;

        for (int i = n ; i>=1 ; i--){

            for(int j=1; j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
