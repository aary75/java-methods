import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of the first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0; // Variable to store the sum
        // Loop through the numbers from 1 to n and add them to sum
        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to sum
        }
        return sum; // Return the total sum
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Check if the user input is valid (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Call the method to get the sum and print the result
            int result = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }
        
        // Close the scanner
        scanner.close();
    }
}
