import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Array to store the quotient and remainder
        int[] result = new int[2];
        
        // Calculate quotient using division operator (/)
        result[0] = number / divisor;
        
        // Calculate remainder using modulus operator (%)
        result[1] = number % divisor;
        
        // Return the result array
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the two numbers (number and divisor)
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is zero to prevent division by zero
        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero.");
        } else {
            // Call the method to get the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Print the quotient and remainder
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
