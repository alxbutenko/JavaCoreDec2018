import java.util.Comparator;
import java.util.Objects;

public abstract class Stationary {
    String brand;
    double price;

    public Stationary(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stationary)) return false;
        Stationary that = (Stationary) o;
        return Double.compare (that.price, price) == 0 &&
                brand.equals (that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash (brand, price);
    }

    static class BrandComparator implements Comparator<Stationary> {

        @Override
        public int compare(Stationary o1, Stationary o2) {
            return o1.getBrand ().compareTo (o2.getBrand ());
        }
    }

    static class PriceComparator implements Comparator<Stationary> {

        @Override
        public int compare(Stationary o1, Stationary o2) {
            return Double.compare (o1.getPrice (), o2.getPrice ());
        }
    }

    static class BrandPriceComparator implements Comparator<Stationary> {

        @Override
        public int compare(Stationary o1, Stationary o2) {
            int priceCompare = Double.compare (o1.getPrice (), o2.getPrice ());

            if (priceCompare != 0) {
                return priceCompare;
            }

            return o1.getBrand ().compareTo (o2.getBrand ());
        }
    }
}