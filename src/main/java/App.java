import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Stationary> stationaryList = new BeginnerStationarySet ().createSet ();

        SumCounter counter = new SumCounter ();
        double sum = counter.countStationarySum (stationaryList);

        System.out.println (sum);
    }
}
