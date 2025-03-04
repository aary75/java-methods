import java.util.Scanner;

public class NumberChecker {

    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check if the number is even or odd
    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 == number2) {
            return 0; // both are equal
        } else {
            return -1; // number1 is smaller
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Take input for 5 numbers
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and check if each number is positive or negative and whether it is even or odd
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            System.out.print("Number " + numbers[i] + " is " + positivity);

            if (positivity.equals("Positive")) {
                String evenOdd = isEvenOrOdd(numbers[i]);
                System.out.println(" and it is " + evenOdd + ".");
            } else {
                System.out.println(".");
            }
        }

        // Compare the first and last elements of the array
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (result == 0) {
            System.out.println("The first element is equal to the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
