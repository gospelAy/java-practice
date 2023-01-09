package Chapter4;

import java.util.Scanner; // import the Scanner class

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        // create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // prompt the user for the total sales for the week
        System.out.print("Enter the total sales for the week: ");
        double totalSales = input.nextDouble();

        // calculate the commission based on the total sales
        double commission = totalSales * 0.09;

        // calculate the total earnings for the week
        double earnings = 200 + commission;

        // display the earnings to the user
        System.out.println("Total earnings for the week: $" + earnings);
    }
}

