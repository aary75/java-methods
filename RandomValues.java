import java.util.Arrays;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number (between 1000 and 9999)
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        
        return numbers;
    }

    // Method to find average, min and max of the array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];  // To store average, min, and max

        // Calculate the average
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        result[0] = sum / numbers.length;  // Average

        // Find the minimum and maximum using Math.min and Math.max
        result[1] = numbers[0];  // Initialize min
        result[2] = numbers[0];  // Initialize max

        for (int num : numbers) {
            result[1] = Math.min(result[1], num);  // Find min
            result[2] = Math.max(result[2], num);  // Find max
        }

        return result;
    }

    public static void main(String[] args) {
        int size = 5;
        
        // Generate the array of 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Find average, min, and max
        double[] stats = findAverageMinMax(randomNumbers);
        
        // Display the generated numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        
        // Display the results: average, min, max
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum Value: " + stats[1]);
        System.out.println("Maximum Value: " + stats[2]);
    }
}
