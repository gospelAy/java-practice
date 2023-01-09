package Chapter4;

import java.util.Scanner; // import the Scanner class

public class RightAngledTriangle {
    public static void main(String[] args) {
        // create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // prompt the user for the length of the base of the triangle
        System.out.print("Enter the length of the base of the triangle (1-10): ");
        int baseLength = input.nextInt();

        // validate the input to ensure it is between 1 and 10
        while (baseLength < 1 || baseLength > 10) {
            System.out.print("Invalid input. Please enter a number between 1 and 10: ");
            baseLength = input.nextInt();
        }

        // draw the right-angled triangle using asterisks
        for (int i = 1; i <= baseLength; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to the next line
        }
    }
}

