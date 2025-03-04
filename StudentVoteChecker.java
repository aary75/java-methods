import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check whether the student can vote
    public boolean canStudentVote(int age) {
        // Validate that the age is not negative
        if (age < 0) {
            return false; // Invalid age, can't vote
        }
        // Check if the age is 18 or greater
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        // Define an array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Loop through the array and take input for the ages of the students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Call the canStudentVote method and display the result
            if (checker.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
