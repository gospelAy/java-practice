package HolidayAssignment;

import java.util.Scanner;

public class MBTIPersonalityTest {
    public static void main(String[] args) {
        // Create an array of questions
        String[] questions = new String[20];
        questions[0] = "Do you prefer to focus on the outer world or on your own inner thoughts?";
        questions[1] = "Do you prefer to focus on the basic information you take in or do you prefer to interpret and add meaning?";
        // Add the rest of the questions

        // Create an array to store the responses
        char[] responses = new char[20];

        // Create a scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user the questions and store their responses
        for (int i = 0; i < 20; i++) {
            System.out.println(questions[i]);
            System.out.println("A) Option 1");
            System.out.println("B) Option 2");
            System.out.print("Enter your response: ");
            char response = scanner.next().charAt(0);

            // Validate the response
            while (response != 'A' && response != 'B') {
                System.out.println("Invalid response. Please enter A or B.");
                System.out.print("Enter your response: ");
                response = scanner.next().charAt(0);
            }

            // Store the response
            responses[i] = response;
        }

        // Close the scanner
        scanner.close();

        // Determine the personality trait based on the responses
        String trait = "";
        // Use the responses array to determine the trait

        // Print the results
        System.out.println("Your responses: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(questions[i] + ": " + responses[i]);
        }
        System.out.println("Your personality trait is: " + trait);
    }
}

