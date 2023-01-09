package Chapter4;

    import java.util.Scanner;

    public class GasMileage {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int totalMiles = 0;
            int totalGallons = 0;

            while (true) {
                // Prompt the user to enter the miles driven and gallons used for a trip
                System.out.print("Enter miles driven (-1 to quit): ");
                int miles = input.nextInt();

                if (miles == -1) {
                    // If the user enters -1, the program should terminate
                    break;
                }

                System.out.print("Enter gallons used: ");
                int gallons = input.nextInt();

                // Calculate the miles per gallon for the trip
                double milesPerGallon = (double) miles / gallons;
                System.out.printf("Miles per gallon for this trip: %.2f\n", milesPerGallon);

                // Add the miles and gallons for this trip to the running total
                totalMiles += miles;
                totalGallons += gallons;
            }

// Calculate and display the overall miles per gallon
            double overallMilesPerGallon = (double) totalMiles / totalGallons;
            System.out.printf("Overall miles per gallon: %.2f\n", overallMilesPerGallon);



        }
    }

