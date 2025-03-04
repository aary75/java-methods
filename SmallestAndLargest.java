import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Array to store the result
        int[] result = new int[2];

        // Find the smallest number
        int smallest = Math.min(number1, Math.min(number2, number3));

        // Find the largest number
        int largest = Math.max(number1, Math.max(number2, number3));

        // Store smallest and largest in the result array
        result[0] = smallest;
        result[1] = largest;

        // Return the result array
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for 3 numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Call the method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Print the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        // Close the scanner
        scanner.close();
    }
}
