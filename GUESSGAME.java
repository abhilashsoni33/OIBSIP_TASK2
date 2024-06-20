import java.util.Scanner;
import java.util.Random;
class GUESSGAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxTries = 5;
        int totalRounds = 3;
        int totalScore = 0;

        System.out.println("Welcome to The Number!");
        System.out.println("Try to guess a number between 1 and 100.");

        for (int round = 1; round <= totalRounds; round++) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfTries = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("\nRound " + round + ":");
            while (!hasGuessedCorrectly && numberOfTries < maxTries) {
                System.out.print("Enter The Number: ");
                int guess = scanner.nextInt();
                numberOfTries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Try Number Between 1 To 100.");
                } else if (guess < numberToGuess) {
                    System.out.println("Number Is Too low.");
                } else if (guess > numberToGuess) {
                    System.out.println("Number is Too high.");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
                    int roundScore = maxTries - numberOfTries + 1; // Award points based on attempts
                    totalScore += roundScore;
                    System.out.println("Round Score: " + roundScore);
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Game Over,The Number Was " + numberToGuess + ".");
            }
        }

        System.out.println("\nTotal score across all rounds: " + totalScore);
        scanner.close();
    }
}
