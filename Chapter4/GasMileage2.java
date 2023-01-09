package Chapter4;

import java.util.Scanner;

/*4.17 (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
from the user*/
public class GasMileage2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of trips taken: ");
        int trip = input.nextInt();

        int milesDriven;
        int gallonUsed;
        int tripCounter = 0;
        double total;
        double milesPerGallon = 0;

        while (tripCounter < trip){

            System.out.println("Enter miles driven ");
            milesDriven = input.nextInt();
            milesDriven++;

            System.out.println("Enter gallon used ");
            gallonUsed = input.nextInt();
            gallonUsed++;

            total = milesDriven + gallonUsed;
            milesPerGallon = total / tripCounter;

            tripCounter++;
        }

        System.out.printf("The average for %d trips taken is %.2f",trip,milesPerGallon);

    }
}
