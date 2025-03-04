

import java.util.Scanner;

public class ChocolateDivision {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        // Array to store the result: [chocolates per child, remaining chocolates]
        int[] result = new int[2];
        
        // Calculate how many chocolates each child gets (quotient)
        result[0] = numberOfChocolates / numberOfChildren;
        
        // Calculate how many chocolates are remaining (remainder)
        result[1] = numberOfChocolates % numberOfChildren;
        
        // Return the result array
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if the number of children is zero to prevent division by zero
        if (numberOfChildren == 0) {
            System.out.println("Error: The number of children cannot be zero.");
        } else {
            // Call the method to get the quotient and remainder (chocolates per child and remaining chocolates)
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Print the result
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}

