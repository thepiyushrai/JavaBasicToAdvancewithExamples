package com.example.java.primitivetypes;

import java.util.Scanner;

/**
 * @author Piyush Rai
 * @date 04/02/24
 * @time 5:41 pm
 */
public class CircleCircumfance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the radius of the circle: ");

       double radius = scanner.nextDouble();
        scanner.close();
       double circumference = 2 * Math.PI * radius;
       System.out.println("The circumference of the circle with radius"+circumference);
    }
}
