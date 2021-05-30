/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 06 - Retirement Calculator
 */

package org.example;

// Import the necessary libraries
import java.util.Scanner;
import java.util.Calendar;
import java.util.TimeZone;

public class App 
{
    // Main function
    public static void main( String[] args )
    {
        // Use the .get command and .getDefault from Calendar and TimeZone respectively
        // to find the year for the time zone of where the user is located
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
        int curYear = localCalendar.get(Calendar.YEAR);

        // Prompt user for their age and store inside an int
        System.out.println("What is your current age?");
        Scanner ageInput = new Scanner(System.in);
        int age = ageInput.nextInt();

        // Prompt user for their desired retirement age and store inside an int
        System.out.println("At what age would you like to retire?");
        Scanner retirementInput = new Scanner(System.in);
        int retirement = retirementInput.nextInt();

        // Calculate the years until the user can retire
        int yearsLeft = retirement - age;

        // Print yearsLeft
        System.out.println("You have " + yearsLeft + " years left until you can retire.");

        // Calculate the exact year at which the user can retire
        int retirementYear = curYear + yearsLeft;

        // Print the year of which the user can retire
        System.out.println("It's " + curYear + ", so you can retire in " + retirementYear + ".");
    }
}
