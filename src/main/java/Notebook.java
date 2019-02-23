public class Notebook extends Stationary {
    private int numberOfPages;

    public Notebook(String brand, double price, int numberOfPages) {
        super (brand, price);
        this.numberOfPages = numberOfPages;
    }
}
