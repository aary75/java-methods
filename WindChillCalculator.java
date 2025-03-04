import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Applying the wind chill formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Check if wind speed is greater than or equal to 3, as the formula is valid for wind speeds of at least 3 mph
        if (windSpeed >= 3) {
            // Call the method to calculate the wind chill
            double windChill = calculateWindChill(temperature, windSpeed);
            // Print the result
            System.out.println("The wind chill temperature is: " + windChill + "°F");
        } else {
            System.out.println("Wind speed must be at least 3 miles per hour.");
        }

        // Close the scanner
        scanner.close();
    }
}
