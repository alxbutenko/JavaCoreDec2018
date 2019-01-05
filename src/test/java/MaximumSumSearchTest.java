import org.junit.Assert;
import org.junit.Test;

public class MaximumSumSearchTest {

    @Test
    public void searchMaxSum() {
        double[] arr;
        arr = new double[]{2.0, 3.2, 4.25, 0.1, 4.4, 1.3, 0.5, 3.2};

        MaximumSumSearch max = new MaximumSumSearch ();
        double actual = max.searchMaxSum (arr);

        double expected = 5.55;

        Assert.assertEquals (expected, actual, 0.001);
    }
}