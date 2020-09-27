package TestWork1;

import java.util.Scanner;

public class ComputerToGuessTheNumber {

    //Create a guessing game, where I have a number and computer tries to guess it.
    // If I write 0 = computer guessed the number.
    // If I write 1 = my number is bigger than computers suggested.
    // If I write 2 = my number is smaller than computers suggested.

    public static void main(String[] args) {

        Scanner CompGuessing = new Scanner(System.in);
        System.out.println("Think of a whole number between 1 and 100. I'll guess what it is!");
        System.out.println("When you're ready, type yes and press enter.");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        int min = 1;
        int max = 100;

        int guesses = 0;
        boolean done = false;
        while(!done){

            int guess = min + (int)(Math.random() * (max - min + 1));
            guesses++;

            System.out.println("My guess is: " + guess);
            System.out.println("Please type 0 if I got it right.");
            System.out.println("Please type 1 if your number is higher.");
            System.out.println("Please type 2 if your number is lower.");
            System.out.println("Then press enter.");

            String answer = scanner.nextLine();

            if(answer.equals("2")){
                max = guess - 1;
            }
            else if(answer.equals("1")){
                min = guess + 1;
            }
            else{
                System.out.println("Hooray!");
                System.out.println("It took me " + guesses + " guesses to get it right. Thanks for playing!");
                done = true;
            }
        }
        scanner.close();
    }
}

