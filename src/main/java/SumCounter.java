import java.util.List;

public class SumCounter {
    public double countStationarySum (List<Stationary> list) {
        double sum = 0;

        for (Stationary elem : list) {
            sum += elem.price;
        }

        return sum;
    }
}
