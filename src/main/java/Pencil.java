public class Pencil extends Stationary {
    PencilHardness hardness;

    enum PencilHardness {B, HB, H}

    public Pencil(String brand, double price, PencilHardness hardness) {
        super (brand, price);
        this.hardness = hardness;
    }
}
