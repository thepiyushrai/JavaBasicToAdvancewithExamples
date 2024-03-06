package com.example.java.enumeration;

/**
 * @author Piyush Rai
 * @date 06/03/24
 * @time 9:54 am
 */
public class EnumExample {
    public static void main(String[] args) {
        // Using the enumeration constants
        Day today = Day.WEDNESDAY;

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday!");
                break;
            default:
                System.out.println("It's not Monday or Wednesday.");
        }

        // Iterating through all enum constants
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }

}
