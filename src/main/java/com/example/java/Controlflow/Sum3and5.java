package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 09/09/23
 * @time 7:19 pm
 */
public class Sum3and5 {



    public static void main(String[] args) {

int i;
        int num = 0;
        int  count = 0;
        for (i = 1; i < 1000; i++) {


             if(i%15 == 0)
             {
                count++;
                 num = i+num;

             }
             if (count == 5)
             {
                 break;
             }
        }
        System.out.print("Sum of no :"+ num);
    }
}
