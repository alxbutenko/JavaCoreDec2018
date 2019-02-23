import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class StationaryOrdererTest {

    @Test
    public void orderByPrice() {
        List<Stationary> stationaryList = new BeginnerStationarySet ().createSet ();

        List<Stationary> actual = new StationaryOrderer ().orderByPrice (stationaryList);

        List<Stationary> expected = new LinkedList<> ();
        expected.add (new Notebook ("NevaBooks", 20, 100));
        expected.add (new Ruler ("FamRulers", 50, 30));
        expected.add (new Pencil ("CZT", 70, Pencil.PencilHardness.HB));
        expected.add (new Pen ("Parker", 120, 2, Pen.PenColor.BLUE));

        for (int i = 0; i < actual.size (); i++) {
            Assert.assertEquals (expected.get (i).price, actual.get (i).price, 0.001);
        }
    }

    @Test
    public void orderByBrand() {
        List<Stationary> expected = new LinkedList<> ();
        expected.add (new Pencil ("CZT", 70, Pencil.PencilHardness.HB));
        expected.add (new Ruler ("FamRulers", 50, 30));
        expected.add (new Notebook ("NevaBooks", 20, 100));
        expected.add (new Pen ("Parker", 120, 2, Pen.PenColor.BLUE));

        List<Stationary> stationaryList = new BeginnerStationarySet ().createSet ();
        List<Stationary> actual = new StationaryOrderer ().orderByBrand (stationaryList);

        for (int i = 0; i < actual.size (); i++) {
            Assert.assertEquals (expected.get (i).brand, actual.get (i).brand);
        }
    }

    @Test
    public void orderByPriceBrand() {
        List<Stationary> expected = new LinkedList<> ();
        expected.add (new Notebook ("NevaBooks", 20, 100));
        expected.add (new Notebook ("NevaBooks", 25, 130));
        expected.add (new Notebook ("TetraBook", 25, 50));
        expected.add (new Notebook ("NevaBooks", 30, 160));
        expected.add (new Ruler ("FamRulers", 50, 30));
        expected.add (new Pencil ("CZT", 70, Pencil.PencilHardness.HB));
        expected.add (new Pen ("Parker", 120, 2, Pen.PenColor.BLUE));

        List<Stationary> stationaryList = new BeginnerStationarySet ().createSet ();
        stationaryList.add (new Notebook ("TetraBook", 25, 50));
        stationaryList.add (new Notebook ("NevaBooks", 30, 160));
        stationaryList.add (new Notebook ("NevaBooks", 25, 130));

        List<Stationary> actual = new StationaryOrderer ().orderByPriceAndBrand (stationaryList);

        for (int i = 0; i < actual.size (); i++) {
            Assert.assertEquals (expected.get (i).price, actual.get (i).price, 0.001);
            Assert.assertEquals (expected.get (i).brand, actual.get (i).brand);
        }
    }
}