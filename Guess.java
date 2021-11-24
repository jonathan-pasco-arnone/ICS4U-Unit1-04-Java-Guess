/*
* This program calculates the amount of time to reheat a
* specific quantity of a specific type of food.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-11-23
*/

// Imports.
import java.util.Scanner;

/**
* This program calculates the amount of time to reheat a
* specific quantity of a specific type of food.
* (remember to change the name after "final class").
*/
final class Guess {

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Guess() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Variables.
        int guess;
        final int minGuessValue = 1;
        final int maxGuessValue = 6;
        final int extra = 1;

        // Generate random number and assign it to the variable
        final int randomNumber = (int) (Math.random() * (maxGuessValue
            - minGuessValue + extra) + minGuessValue);

        // Create scanner objects for inputs.
        final Scanner myObjOne = new Scanner(System.in);
        final Scanner myObjTwo = new Scanner(System.in);
        // Ask for inputs
        System.out.println("Guess the random number from 1 to 6: ");
        guess = myObjOne.nextInt();
        /*
        * This accepts an inputted and tests it.
        */
        try {
            do {

                // Calculations
                if (guess < minGuessValue || guess > maxGuessValue) {
                    System.out.println("Your guess won't count. Guess again.");
                } else if (guess < randomNumber) {
                    System.out.println("You guessed too low. Guess again.");
                } else if (guess > randomNumber) {
                    System.out.println("You guessed too high. Guess again.");
                } else {
                    System.out.println("This is not an integer");
                    break;
                }

                // Ask for input
                System.out.println("Guess the same random"
                    + " number from 1 to 6 again: ");
                guess = myObjOne.nextInt();

            } while (guess != randomNumber);

            // Outputs.
            System.out.println("You Guessed Correctly!");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("That was not a valid input ");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
