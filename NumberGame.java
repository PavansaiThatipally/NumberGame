import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a random object for generating random numbers
        Random random = new Random();

        // Generate a random number between 1 and 100
        int number = random.nextInt(100) + 1;

        // Initialize the number of guesses and the user's guess
        int guesses = 0;
        int guess = 0;

        // Print the instructions for the game
        System.out.println("Welcome to the number game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("You have to guess the number in as few attempts as possible.");

        // Loop until the user guesses the number or quits
        while (true) {
            // Prompt the user to enter a guess
            System.out.print("Enter your guess (or 0 to quit): ");
            guess = scanner.nextInt();

            // If the user enters 0, end the game
            if (guess == 0) {
                System.out.println("You have quit the game.");
                break;
            }

            // Increment the number of guesses
            guesses++;

            // Check if the user's guess is correct, too high, or too low
            if (guess == number) {
                System.out.println("You have guessed the number!");
                System.out.println("The number was " + number);
                System.out.println("You took " + guesses + " guesses.");
                break;
            } else if (guess < number) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        // Close the scanner object
        scanner.close();
    }
}