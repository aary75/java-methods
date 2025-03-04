import java.util.Scanner;

public class PerimeterOfTriangle {
     public static double calculatePerimeter(double firstSide, double secondSide, double thirdSide) {
          
          double perimeter = firstSide + secondSide + thirdSide;

          return perimeter;
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanceToCover = 5000;

        double firstSide = scanner.nextDouble();
        double secondSide = scanner.nextDouble();
        double thirdSide = scanner.nextDouble();

        double perimeterTriangle = calculatePerimeter(firstSide, secondSide, thirdSide);

        if(perimeterTriangle > 5000) System.out.print("Less than 1 rounds required");
        else if(perimeterTriangle ==5000 ) System.out.print("Exactly 1 round required");
        else {
             System.out.print((5000/perimeterTriangle) + " rounds required");
         }
}}

