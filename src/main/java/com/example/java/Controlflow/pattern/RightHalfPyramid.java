package com.example.java.Controlflow.pattern;

/**
 * @author Piyush Rai
 * @date 21/09/23
 * @time 7:32 am
 */
public class RightHalfPyramid {

    public static void main(String[] args) {
        int n = 5;

          for (int i = 1 ; i<=n ; i++){

              for(int j=1; j<i;j++){

                  System.out.print("*");
              }
              System.out.println();
          }
    }
}
