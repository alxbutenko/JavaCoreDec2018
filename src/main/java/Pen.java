import java.util.Objects;

public class Pen extends Stationary {
    private int thickness;
    private PenColor penColor;

    enum PenColor {BLUE, GREEN, RED, BLACK}

    public Pen(String brand, double price, int thickness) {
        super(brand, price);
        this.penColor = PenColor.BLUE;
        this.thickness = thickness;
    }

    public Pen(String brand, double price, int thickness, PenColor color) {
        super(brand, price);
        this.penColor = color;
        this.thickness = thickness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;
        if (!super.equals (o)) return false;
        Pen pen = (Pen) o;
        return thickness == pen.thickness &&
                penColor == pen.penColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash (super.hashCode (), thickness, penColor);
    }

    @Override
    public String toString() {
        return "Pen (" +
                "brand: \'" + brand + '\'' +
                ", thickness: " + thickness +
                ", color: " + String.valueOf (penColor).toLowerCase () +
                ", price: " + price + ')';
    }
}