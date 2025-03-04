public class SpringSeason {

    // Method to check if the date is in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring season is from March 20 to June 20
        if (month == 3 && day >= 20) {
            return true; // March 20 or later
        } else if (month == 4 || month == 5) {
            return true; // April and May are always Spring months
        } else if (month == 6 && day <= 20) {
            return true; // June 20 or earlier
        } else {
            return false; // All other dates are not in Spring
        }
    }

    public static void main(String[] args) {
        // Check if the user provided exactly two arguments for month and day
        if (args.length != 2) {
            System.out.println("Please provide two arguments: month and day.");
            return;
        }

        // Parse the month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date is within the Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
