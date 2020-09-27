package Lesson4;

public class VendingMachine {
    private int amountOfProducts;
    private int balance;

    public VendingMachine(int amountOfProducts, int balance) {
        this.amountOfProducts = amountOfProducts;
        this.balance = balance;
    }

    public void printInformation() {
        System.out.println("Amount of goods " + amountOfProducts);
        System.out.println("Current balance is " + balance);
    }

    public void buyProduct(int amount) {
        if (amountOfProducts > 0) {
            balance += amount;
            amountOfProducts = amountOfProducts - 1;
        } else {
            System.out.println("Empty stock!!");
        }
    }

    public void addProduct(int amountOfProducts) {
        if (balance >= 100) {
            this.amountOfProducts += amountOfProducts;}
                else
                System.out.println("No more cash");

            }
        }
