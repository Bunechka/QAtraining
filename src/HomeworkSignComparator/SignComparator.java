package HomeworkSignComparator;

public class SignComparator {
    private int number;

   public void number (int numberToCompare) {
       this.number = numberToCompare;
    }

    public String compare(int number) {
        if (number > 0) {
            return "Number is positive";
        } else if (number < 0) {
            return "Number is negative";
        } else {
            return "Number is equal to 0";
        }
    }
}
