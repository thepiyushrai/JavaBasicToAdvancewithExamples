package com.example.java.primitivetypes;

import java.util.Arrays;

/**
 * @author Piyush Rai
 * @date 04/02/24
 * @time 12:07 pm
 */
public class PrimitiveAndReferences {

    public static void main(String[] args) {
        int num1 = 32;
        int num2 = 32;
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("1 == 2: " + (1 == 2));
        System.out.println("65 == 'A': " + (65 == 'A'));
        Integer i = 128;
        Integer i2 = 128;
        Integer int1 = 128;
        Integer int2 = 128;

        System.out.println("i == i2: " + (int1 == int2));

        @SuppressWarnings("removal") Integer i5 = new Integer(127);
        @SuppressWarnings("removal") Integer i6 = new Integer(127);
        System.out.println("i5 == i6: " + (i5 == i6));		// false

        Integer i7 = Integer.valueOf(127);
        Integer i8 = Integer.valueOf(127);
        System.out.println("i7 == i8: " + (i7 == i8));		// true

        System.out.println("i.equals(i2): " + i.equals(i2));	// true

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println("arr1 == arr2: " + (arr1 == arr2));			// false
        System.out.println("arr1.equals(arr2): " + arr1.equals(arr2)); 	// false
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));	// true

        arr1 = arr2;
        System.out.println(arr1 == arr2);				// true


    }
}
