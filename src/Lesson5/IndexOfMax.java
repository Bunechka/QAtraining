package Lesson5;

public class IndexOfMax {
    public static void main(String[] args) {
        int [] elements = {1, 3, 5, 7, 11, 17, 0, 2};

        int idx = 0;
         for (int i = 0; i < elements.length; i++) {
                if (elements[i] > elements[idx]){
                        idx = i;
                }
         }
         System.out.println("Element index is " + idx);
         System.out.println("Max element in array is " + elements[idx]);
    }

}
