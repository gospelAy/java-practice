package Snacks;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request credit card number from user
        System.out.print("Enter credit card number: ");
        String creditCardNumber = scanner.nextLine();

        // Validate credit card number and determine type
        String creditCardType = "Unknown";
        boolean isValid = false;
        if (creditCardNumber.matches("^4[0-9]{12}(?:[0-9]{3})?$")) {
            creditCardType = "Visa";
            isValid = true;
        } else if (creditCardNumber.matches("^5[1-5][0-9]{14}$")) {
            creditCardType = "MasterCard";
            isValid = true;
        } else if (creditCardNumber.matches("^3[47][0-9]{13}$")) {
            creditCardType = "American Express";
            isValid = true;
        } else if (creditCardNumber.matches("^6(?:011|5[0-9]{2})[0-9]{12}$")) {
            creditCardType = "Discover";
            isValid = true;
        }

        // Print credit card type and validity status
        System.out.println("Credit card type: " + creditCardType);
        System.out.println("Valid: " + isValid);
    }
}

