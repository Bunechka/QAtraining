package Lesson4;

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachineDemo vendingMachineDemo = new VendingMachineDemo();
        vendingMachineDemo.TestPositive();
        System.out.println("-----------------------------");
        vendingMachineDemo.TestNegative();

    }

    public void TestPositive() {
        VendingMachine vendingMachine = new VendingMachine(10, 1000);
        vendingMachine.addProduct(2);
        vendingMachine.buyProduct(100);
        vendingMachine.printInformation();
    }
    public void TestNegative() {
        VendingMachine vendingMachine = new VendingMachine(0, 0);
        vendingMachine.addProduct(0);
        vendingMachine.buyProduct(100);
        vendingMachine.printInformation();
    }
}
