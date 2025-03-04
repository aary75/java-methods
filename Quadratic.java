import java.util.Scanner;

public class Quadratic {

    // Method to calculate the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  // Calculating discriminant
        
        // If delta is positive, two real roots exist
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        }
        // If delta is zero, one real root exists
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        }
        // If delta is negative, no real roots
        else {
            return new double[] {};  // Empty array indicates no real roots
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input values for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Get the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);
        
        // Display the results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }

        scanner.close();
    }
}
