import java.util.Scanner;

public class FriendsInfo {

    // Method to find the youngest of the three friends
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngestFriend = "Amar";
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                switch(i) {
                    case 1: youngestFriend = "Akbar"; break;
                    case 2: youngestFriend = "Anthony"; break;
                }
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest of the three friends
    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
        String tallestFriend = "Amar";
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                switch(i) {
                    case 1: tallestFriend = "Akbar"; break;
                    case 2: tallestFriend = "Anthony"; break;
                }
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for ages and heights
        System.out.println("Enter the age and height of 3 friends (Amar, Akbar, Anthony):");

        // Input for Amar
        System.out.print("Amar's age: ");
        ages[0] = scanner.nextInt();
        System.out.print("Amar's height (in meters): ");
        heights[0] = scanner.nextDouble();

        // Input for Akbar
        System.out.print("Akbar's age: ");
        ages[1] = scanner.nextInt();
        System.out.print("Akbar's height (in meters): ");
        heights[1] = scanner.nextDouble();

        // Input for Anthony
        System.out.print("Anthony's age: ");
        ages[2] = scanner.nextInt();
        System.out.print("Anthony's height (in meters): ");
        heights[2] = scanner.nextDouble();

        // Find and display the youngest friend
        String youngest = findYoungest(ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = findTallest(heights);
        System.out.println("The tallest friend is: " + tallest);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
