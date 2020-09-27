package Lesson3;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        //System.out.println ("My balance is " + bankAccount.balance);
        bankAccount.deposit(650);
        bankAccount.printBalance();
        //System.out.println ("My balance is " + bankAccount.balance);
        bankAccount.withdraw(100);
        bankAccount.printBalance();
        //System.out.println ("My balance is " + bankAccount.balance);

    }
}
