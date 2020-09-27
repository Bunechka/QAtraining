package Lesson5;
import java.util.Arrays;
import java.util.Random;

public class StatsWithArrays {
    public static void main(String[] args) {

        int [] array = new int[10];
        int[] statisticData = new int [3];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(100);

            System.out.println("Element with index: " + i + " with value " + array[i]);

            statisticData[2] =+ array[i];

            if (array[i] > statisticData[1]) {
                statisticData[1] = array[i];
            }
            if (array[i] < statisticData[0] || i == 0) {
                statisticData[0] = array[i];
            }
            System.out.println(Arrays.toString(array));
        }
       // System.out.println();
        // System.out.println(Arrays.toString(array));
        System.out.println(statisticData[0]);
        System.out.println(statisticData[1]);
        System.out.println(statisticData[2]);
    }
}
