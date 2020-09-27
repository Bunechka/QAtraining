package Lesson3;

public class BankAccount {
    private int balance;
    public void deposit (int amount) {
        this.balance += amount;
    }
    public void withdraw (int amount) {
        this.balance -= amount;
    }
    public void printBalance () {
        System.out.println ("My balance is " + balance);
    }
}
