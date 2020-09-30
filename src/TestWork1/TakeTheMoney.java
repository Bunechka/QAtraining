package TestWork1;

import java.util.Scanner;
import java.lang.Math;

public class TakeTheMoney {
    //Enter the amount - the program must calculate which coins and how many of them to give back.
    // Example: 15 =>
    //  1 = 1 EUR coin, 1 = 0.50 EUR coin.
    // Coins available: 2 and 1 EUR (100,200), 50,20, 10, 2, 1 cents.
    //  ?use 2 arrays for calculations/results.

    public static void main(String[] args) {
        int [] coinList =  {1, 2, 5, 10, 20, 50, 100, 200};
        int [] givenCoins = {10, 10, 10, 10, 10, 10, 10, 10};


        System.out.println("Enter your amount for coin exchange and press enter.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        int value = Math.abs(scanner.nextInt());

        System.out.println(value);
        int i = coinList.length - 1;
            while (value > 0 && i >= 0) {
                int coin = coinList [i];
                int count = givenCoins[i] = value/ coin;
                value = value % coin;
                    if(count > 0) {
                        if (coin >= 100) {
                            System.out.println(count + " coin(s) of " + (coin / 100) + " Euro");
                        } else {
                            System.out.println(count + " coin(s) of " + coin + " cent");
                        }
                    }
                    i--;
            }
    }
}
