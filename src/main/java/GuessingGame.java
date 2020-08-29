import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        int numberToGuess;

        numberToGuess = (int) (Math.random() * 99 + 1);

        System.out.println("Secret number is " + numberToGuess);

        Scanner input = new Scanner(System.in);
        int guess;
        int oldGuessDifference;
        int guessDifference;
        int currentTemperature;
        int numberOfGuesses = 10;

        System.out.println("Please guess a number.");
        System.out.println("You have" + numberOfGuesses + " guesses.");
        guess = input.nextInt();

        if (guess == numberToGuess) {
            System.out.println("You guessed correctly!");
        } /* else {
                System.out.println("You have not guessed correctly... LOSER!");
            } */ else if (guess > numberToGuess) {
            System.out.println("You guessed too high!  LOSER!");
        } else {
            System.out.println("You guessed too low!  Loser!");
        }

        guessDifference = Math.abs(numberToGuess - guess);

        System.out.println(guessDifference);

        numberOfGuesses--;

        System.out.println("You have " + numberOfGuesses + " guesses left");

        do {

            currentTemperature = Math.abs(numberToGuess - guess);

            if (currentTemperature < 5 && currentTemperature != 0) {
                System.out.println("Pretty hot!");
            } else if (currentTemperature > 4 && currentTemperature< 16) {
                System.out.println("Kinda warm");
            } else if (currentTemperature > 15 && currentTemperature < 26) {
                System.out.println("Kinda cold");
            } else {
                System.out.println("Ice cold! alright alright alright alright");
            }

            oldGuessDifference = guessDifference;

            guess = input.nextInt();

            System.out.println("You entered " + guess);

            if (guess == numberToGuess) {
                System.out.println("You guessed correctly!");
            } /* else {
                System.out.println("You have not guessed correctly... LOSER!");
            } */ else if (guess > numberToGuess) {
                System.out.println("You guessed too high!");
            } else {
                System.out.println("You guessed too low!");
            }

            guessDifference = Math.abs(numberToGuess - guess);

            System.out.println(guessDifference);

            if (guessDifference < oldGuessDifference) {
                System.out.println("You're getting warmer.");
            } else if (guessDifference > oldGuessDifference) {
                System.out.println("You're getting colder.");
            } else {
                System.out.println("No change in the temperature...");
            }

            numberOfGuesses--;

            System.out.println("You have " + numberOfGuesses + " guesses left.");


        } while(guess != numberToGuess && numberOfGuesses != 0);

        if (guess == numberToGuess) {
            System.out.println("Congratulations, you won!");
        } else {
            System.out.println("Sorry, you're out of guesses.  Better luck next time.");
        }

    }
}
