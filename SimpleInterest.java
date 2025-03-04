// Creating the SimpleInterest class to find simple interst
import java.util.Scanner;

public class SimpleInterest {
      // Defining the function simpleInterst
      public static int simpleInterest(int principal, int rate, int time) {
            
            // Calculating the simpleInterest
           int simpleInterest = ( principal * rate * time ) / 100;

            // returning the simpleInterst value
            return simpleInterest;
      }

      public static void main(String[] args) {

          // Creating the scanner class to get user's input
          Scanner scanner = new Scanner(System.in);
          
          // Creating a variable Principal to get value of Principal from user
          int principal = scanner.nextInt();

          // Creating a variable rate to get value of rate from user
          int rate = scanner.nextInt();

          // Creating a variable time to get value of time from user
          int time = scanner.nextInt();


          // Declare the function simpleInterest for calculating simple Interest
          int answer = simpleInterest(principal,rate,time);
 
         // Printing the simple interest
         System.out.print("The Simple Interest is " + answer + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
}}
