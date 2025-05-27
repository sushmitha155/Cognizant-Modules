import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100:");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > numberToGuess)
                System.out.println("Too high! Try again.");
            else if (guess < numberToGuess)
                System.out.println("Too low! Try again.");
            else
                System.out.println("Congratulations! You guessed it right.");

        } while (guess != numberToGuess);

        scanner.close();
    }
}
