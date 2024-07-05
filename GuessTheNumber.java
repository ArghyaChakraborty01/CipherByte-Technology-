import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
          public static void main(String[] args) {
                    int randomNumber = getRandomNumber();
                    Scanner scanner = new Scanner(System.in);
                    int maxAttempts = 10;
                    int attempts = 0;
                    int score = 0;

                    System.out.println("Welcome to Guess the Number!");
                    System.out.println("I'm thinking of a number between 1 and 100.");

                    while (attempts < maxAttempts) {
                              System.out.print("Enter your guess: ");
                              int userGuess = scanner.nextInt();

                              if (userGuess == randomNumber) {
                                        System.out.println("Congratulations! You guessed the number.");
                                        break;
                              } else if (userGuess > randomNumber) {
                                        System.out.println("Too high! Try again.");
                              } else {
                                        System.out.println("Too low! Try again.");
                              }

                              attempts++;
                              score += calculateScore(attempts);
                    }

                    if (attempts >= maxAttempts) {
                              System.out.println("Sorry, you didn't guess the number. The number was " + randomNumber
                                                  + ".");
                    }
          }

          private static int getRandomNumber() {
                    return new Random().nextInt(100) + 1;
          }

          private static int calculateScore(int attempts) {

                    return 100 - attempts;
          }
}
