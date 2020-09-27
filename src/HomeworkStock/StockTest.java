package HomeworkStock;

public class StockTest {
    public static void main(String[] args) {
        Stock seb = new Stock("SEB", 112);
        seb.printInformation();

        seb.updatePrice(7);
        seb.updatePrice(3);
        seb.updatePrice(10);

        seb.printInformation();

    }
}
