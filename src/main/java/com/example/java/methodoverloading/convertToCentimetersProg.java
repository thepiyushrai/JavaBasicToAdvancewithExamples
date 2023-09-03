package com.example.java.methodoverloading;

/**
 * @author Piyush Rai
 * @date 03/09/23
 * @time 10:49 am
 */
public class convertToCentimetersProg {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        // return convertToCentimeters((feet * 12) + inches);
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }
}
