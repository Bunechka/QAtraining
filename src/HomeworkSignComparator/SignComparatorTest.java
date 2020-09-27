package HomeworkSignComparator;

public class SignComparatorTest {
    public static void main(String[] args) {

        SignComparator test1 = new SignComparator();
        System.out.println(test1.compare(0));
        SignComparator test2 = new SignComparator();
        System.out.println(test2.compare(20));
        SignComparator test3 = new SignComparator();
        System.out.println(test3.compare(-10));
    }
}
