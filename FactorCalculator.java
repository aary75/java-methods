import java.util.Scanner;

public class FactorCalculator {

    // Method to find the factors of the number and return them in an array
    public static int[] findFactors(int number) {
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        // Return the factors array
        return factors;
    }

    // Method to find the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the squares of the factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call method to find factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Call the methods to calculate sum, sum of squares, and product
        int sum = findSum(factors);
        int product = findProduct(factors);
        double sumOfSquares = findSumOfSquares(factors);

        // Display the results
        System.out.println("Sum of the factors: " + sum);
        System.out.println("Product of the factors: " + product);
        System.out.println("Sum of the squares of the factors: " + sumOfSquares);

        // Close the scanner
        scanner.close();
    }
}

