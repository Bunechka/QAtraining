package Lesson5;
import java.util.Random;

public class Statistics {

    public static void main(String[] args) {
        Random random = new Random();

        int n = 5;

        System.out.println("Generating " + n + " numbers: ");

        int sum = 0;
        int max = 0;
        int min = 0;

        for (int i = 0; i < n; i++) {
            int randomValue = random.nextInt(100);
            System.out.println("Element: " + i + " value is equal " + randomValue);

            sum += randomValue;

            if (randomValue > max) {
                max = randomValue;
            }

            if (randomValue < min || i == 0) {
                min = randomValue;
            }

            i++;

            double avg = (double) sum / n;

            System.out.println("Sum =  " + sum);
            System.out.println("Min =  " + min);
            System.out.println("Max =  " + max);
            System.out.println("Avg =  " + avg);

        }

    }
}