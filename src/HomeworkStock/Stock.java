package HomeworkStock;

public class Stock {
    private String companyName;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;

    }

    public void printInformation() {
        System.out.println("Company= " + companyName + "," + " Current price " + currentPrice + "," + " Min price= " + minPrice + "," + " Max price= " + maxPrice);

    }

    public void updatePrice(double value) {
        currentPrice = value;

        if (maxPrice < value) {
            maxPrice = value;
        }
        if (minPrice > value) {
            minPrice = value;
        }
    }
}

