import java.util.*;


public class StationaryOrderer {
    public List<Stationary> orderByPrice(List<Stationary> list) {
        Collections.sort (list, new Stationary.PriceComparator ());
        return list;
    }

    public List<Stationary> orderByBrand(List<Stationary> list) {
        Collections.sort (list, new Stationary.BrandComparator ());
        return list;
    }

    public List<Stationary> orderByPriceAndBrand(List<Stationary> list) {
        Collections.sort (list, new Stationary.BrandPriceComparator ());
        return list;
    }
}
