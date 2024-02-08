package com.example.java.string;

/**
 * @author Piyush Rai
 * @date 07/02/24
 * @time 12:41 am
 */
public class StringFormattingDemo {
    public static void main(String[] args) {
        System.out.println("===== String formatting =====");
        System.out.println();
        String firstName = "Andrii";

        String greetingsTemplate = "Hello, dear %s! Good %s!";

        String morning = "morning";
        String afternoon = "afternoon";
        String evening = "evening";
        String formattedString = String.format(greetingsTemplate, firstName, morning);
        System.out.println(formattedString);

        System.out.printf("You have %d computers available at store\n", 10);
    }
}
