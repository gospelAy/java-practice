package Chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Initialize variables for each customer
        int accountNumber;
        double beginningBalance;
        double totalCharged;
        double totalCredits;
        double allowedCreditLimit;

        // Read in the account number, balance, charged amount, credits, and credit limit
        System.out.print("Enter account number: ");
        accountNumber = input.nextInt();
        System.out.print("Enter beginning balance: ");
        beginningBalance = input.nextDouble();
        System.out.print("Enter total charged this month: ");
        totalCharged = input.nextDouble();
        System.out.print("Enter total credits applied: ");
        totalCredits = input.nextDouble();
        System.out.print("Enter allowed credit limit: ");
        allowedCreditLimit = input.nextDouble();

        // Calculate the new balance for the customer
        double newBalance = beginningBalance + totalCharged - totalCredits;

        // Determine whether the customer has exceeded the credit limit
        if (newBalance > allowedCreditLimit) {
            System.out.println("Credit limit exceeded.");
        } else {
            System.out.println("Credit limit not exceeded.");
        }
    }
}
