package Chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for tax rates
        final double TAX_RATE_1 = 0.15;
        final double TAX_RATE_2 = 0.20;
        final double TAX_CEILING = 30000.0;

        // Input and calculate tax for each citizen
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter citizen " + i + "'s name: ");
            String name = scanner.nextLine();
            System.out.print("Enter citizen " + i + "'s earnings: ");
            double earnings = scanner.nextDouble();
            scanner.nextLine();  // Consume remaining newline character

            double tax = 0.0;
            if (earnings <= TAX_CEILING) {
                tax = earnings * TAX_RATE_1;
            } else {
                tax = TAX_CEILING * TAX_RATE_1 + (earnings - TAX_CEILING) * TAX_RATE_2;
            }

            System.out.println(name + "'s total tax is $" + tax);
        }
    }
}

