package TestWork1;
import java.util.Random;

public class Dices {

    public static void main(String[] args) {

        int dice1;
        int dice2;
        int dice3;

        dice1 = (int) (Math.random() * 6) + 1;

        do {
             dice1 = (int) (Math.random() * 6) + 1;
             dice2 = (int) (Math.random() * 6) + 1;
             dice3 = (int) (Math.random() * 6) + 1;

            System.out.println("First dice is " + dice1);
            System.out.println("Second dice is " + dice2);
            System.out.println("Third dice is " + dice3);
            System.out.println();
        }
        while ((dice1 != dice2 || dice2 != dice3)) ;
        System.out.println("You have a dice strike!");
    }

}
