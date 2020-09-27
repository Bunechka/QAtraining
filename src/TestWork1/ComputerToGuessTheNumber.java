package TestWork1;

import java.util.Scanner;

public class ComputerToGuessTheNumber {

    //Create a guessing game, where I have a number and computer tries to guess it.
    // If I write 0 = computer guessed the number.
    // If I write 1 = my number is bigger than computers suggested.
    // If I write 2 = my number is smaller than computers suggested.

    public static void main(String[] args) {

        Scanner CompGuessing = new Scanner(System.in);
        int guess = 1 + (int) (100 * Math.random());

        System.out.println("Guessing number is: " + guess);
        System.out.println("My number is bigger than " + guess);
        System.out.println("My number is smaller than " + guess);

    }
}
