package com.example.java.Controlflow;

/**
 * @author Piyush Rai
 * @date 04/09/23
 * @time 4:06 am
 */
public class SwitchCase {
    public static void main(String[] args) {
        // Define a variable for the day of the week (1 for Monday, 2 for Tuesday, etc.)
        int dayOfWeek = 3;

        // Use a switch statement to determine the day of the week based on the value of dayOfWeek
        switch (dayOfWeek) {
            case 1:
                // If dayOfWeek is 1, execute this code block
                System.out.println("It's Monday");
                break; // Exit the switch statement

            case 2:
                // If dayOfWeek is 2, execute this code block
                System.out.println("It's Tuesday");
                break; // Exit the switch statement

            case 3:
                // If dayOfWeek is 3, execute this code block
                System.out.println("It's Wednesday");
                break; // Exit the switch statement

            case 4:
                // If dayOfWeek is 4, execute this code block
                System.out.println("It's Thursday");
                break; // Exit the switch statement

            case 5:
                // If dayOfWeek is 5, execute this code block
                System.out.println("It's Friday");
                break; // Exit the switch statement

            case 6:
                // If dayOfWeek is 6, execute this code block
                System.out.println("It's Saturday");
                break; // Exit the switch statement

            case 7:
                // If dayOfWeek is 7, execute this code block
                System.out.println("It's Sunday");
                break; // Exit the switch statement

            default:
                // If dayOfWeek doesn't match any case, execute this code block
                System.out.println("Invalid day of the week");
        }
    }
}
