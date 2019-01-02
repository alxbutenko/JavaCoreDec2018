import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculateAn() {
        int index = 2;

        Calculator calc = new Calculator ();
        double actualMin = calc.calculateAn (index);

        double expectedMin = 1.0 / 9;

        Assert.assertEquals (expectedMin, actualMin, 0.001);
    }
}