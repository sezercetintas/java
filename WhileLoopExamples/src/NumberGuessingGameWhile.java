import java.util.Scanner;
public class NumberGuessingGameWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose a random number between 1 and 100
        int guessedNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attemptCount = 0;

        System.out.println("I have chosen a number between 1 and 100. Try to guess!");

        while (guess != guessedNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attemptCount++;

            if (guess < guessedNumber) {
                System.out.println("Try a larger number.");
            } else if (guess > guessedNumber) {
                System.out.println("Try a smaller number.");
            } else {
                System.out.println("Congratulations! You guessed it right in " + attemptCount + " attempts.");
            }
        }
    }
}
