package Lesson3;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println ("Sum Result " + calculator.sum(6, 9));
        System.out.println ("Diff Result " + calculator.diff(23, 9));
        System.out.println ("Multiply Result " + calculator.multiply(3345, 987));
        System.out.println ("Divide Result " + calculator.divide(978, 10));

    }
}
