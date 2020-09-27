package TestWork1;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner numberGame = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());
        int trying = 10;
        int i, guess;

        System.out.println("A number is chosen " + "between 1 and 100." + " Guess the number.");

        for (i = 0; i < trying; i++ ) {

            System.out.println("Guess the number:");
            guess = numberGame.nextInt();

            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != trying - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != trying - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
    }
}
