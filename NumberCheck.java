import java.util.Scanner;

public class NumberCheck {

    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;  // Positive number
        } else if (num < 0) {
            return -1; // Negative number
        } else {
            return 0;  // Zero
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Call the method and store the result
        int result = checkNumber(number);
        
        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
