package TestWork1;

import java.util.Scanner;
import java.util.Arrays;

public class TakeTheMoney {
    //Enter the amount - the program must calculate which coins and how many of them to give back. Example: 150 =>
    //1 = 1 EUR coin, 1 = 0.50 EUR coin.
    // Coins available: 2 and 1 EUR, 50,20, 10, 2, 1 cents.
    //create 2 arrays for calculations.

    public static void main(String[] args) {
        int [] coinTypes =  {1, 2, 5, 10, 20, 50, 100, 200};
        int [] givenCoins = {0, 0, 0,  0,  0,  0,   0,   0};
        int amount = 0;

        System.out.println("Enter your amount for coin exchange and press enter.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("Available coins are: " + Arrays.toString(coinTypes));


        System.out.println("Your amount is made of coins: " + Arrays.toString(givenCoins));


    }
}
