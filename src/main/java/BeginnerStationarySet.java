import java.util.ArrayList;
import java.util.List;

public class BeginnerStationarySet {
    public List<Stationary> createSet () {
        List<Stationary> beginnerSet = new ArrayList<> ();

        beginnerSet.add (new Notebook ("NevaBooks", 20, 100));
        beginnerSet.add (new Pen ("Parker", 120, 2, Pen.PenColor.BLUE));
        beginnerSet.add (new Pencil ("CZT", 70, Pencil.PencilHardness.HB));
        beginnerSet.add (new Ruler ("FamRulers", 50, 30));

        return beginnerSet;
    }
}
