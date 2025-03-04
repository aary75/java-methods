import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to find the sum of n natural numbers
    public static int sumRecursive(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        } else {
            // Recursive case: sum of n natural numbers is n + sum of first (n-1) numbers
            return n + sumRecursive(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula n * (n + 1) / 2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a natural number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Validate the input
        if (n <= 0) {
            System.out.println("Input is not a valid natural number. Exiting...");
            System.exit(0); // Exit the program if the input is not a valid natural number
        }

        // Compute the sum using recursion
        int recursiveSum = sumRecursive(n);

        // Compute the sum using the formula
        int formulaSum = sumFormula(n);

        // Display the results
        System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaSum);

        // Compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct.");
        } else {
            System.out.println("There is an error in the computation.");
        }

        // Close the scanner
        scanner.close();
    }
}
