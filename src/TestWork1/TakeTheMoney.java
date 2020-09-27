package TestWork1;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class TakeTheMoney {
    //Enter the amount - the program must calculate which coins and how many of them to give back.
    // Example: 150 =>
    //  1 = 1 EUR coin, 1 = 0.50 EUR coin.
    // Coins available: 2 and 1 EUR (100,200), 50,20, 10, 2, 1 cents.
    //  use 2 arrays for calculations/results.

    public static void main(String[] args) {
        double [] coinList =  {0.01, 0.02, 0.05, 0.10, 0.20, 0.50, 1.00, 2.00};
        int [] givenCoins =   {   0,    0,    0,    0,    0,    0,    0,    0};
        int k, value;


        System.out.println("Enter your amount for coin exchange and press enter.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();



        System.out.println("Available coins are: " + Arrays.toString(coinList));
        System.out.println("Your amount is made of coins: " + Arrays.toString(givenCoins));


    }
}
