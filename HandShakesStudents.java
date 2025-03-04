//Creating the HandShakes class to find total number of handshakes
import java.util.Scanner;

public class HandShakes {
//   Defining the totalHandShakes function to calculate total number of handshakes
     public static void totalHandShakes(int numberOfStudents) {
        
        // Calculating the total number of handshakes
        int totalHandShakes = ( numberOfStudents * (numberOfStudents - 1)) / 2;
 
        // Printing the total number of handshakes
        System.out.print("Total hand shakes between " + numberOfStudents + " is " + totalHandShakes);
}


     public static void main(String[] args) {
         // Creating the scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

         // Getting total number of students present
         System.out.print("Total number of persons is ");
         int numberOfStudents = scanner.nextInt();

         // Declaring the function totalHandShakes to find total number of handshakes
         totalHandShakes(numberOfStudents);

}}
