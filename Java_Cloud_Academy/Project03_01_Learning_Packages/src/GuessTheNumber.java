import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int ourGuess;
        int computerNumber;
        int guessTheCount = 0;
        boolean guessedNumber = false;

        Random random = new Random();


        Scanner scan = new Scanner(System.in);
        computerNumber = random.nextInt(100) + 1;

        while (!guessedNumber) {
            System.out.println("Enter your guess number: ");
            ourGuess = scan.nextInt();
            guessTheCount++;


            if (ourGuess >= 1 && ourGuess <= 100) {
                if (ourGuess == computerNumber) {

                    System.out.println("Congrats, you guessed the number!" +
                            guessTheCount + " guesses! Thank you for playing");
                    guessedNumber = true;

                } else if (ourGuess > computerNumber) {
                    System.out.println("Your guess was too high");
                } else {
                    System.out.println("Your guess wass to low! ");
                }
            } else {
                System.out.println("Invalid please choose between 1 and 100:");
            }
        }
    }
} // end of main