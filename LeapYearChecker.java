import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is a valid year in the Gregorian calendar
        if (year >= 1582) {
            // Apply the leap year conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;  // It's a leap year
            } else {
                return false; // It's not a leap year
            }
        } else {
            System.out.println("Year should be >= 1582 (Gregorian calendar).");
            return false;
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Call the method to check if it's a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner
        scanner.close();
    }
}
