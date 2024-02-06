package com.example.java.Controlflow.pattern;

/**
 * @author Piyush Rai
 * @date 26/09/23
 * @time 1:32 am
 */
public class PyramidPattern {
    public static void main(String[] args) {

        int n = 5;
        int i,j;

        for( i = 0; i<=n ;i++) {

            for (j = n;j >=1; j--) {
                if(i>=j) {
                    System.out.print("*");
                }
            }
        }

    }
}
