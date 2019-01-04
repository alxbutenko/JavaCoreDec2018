import org.junit.Assert;

public class FunctionTest {

    @org.junit.Test
    public void calc() {
        double expectedRes = -3.0;
        double actualRes = Function.calc (0.0);

        Assert.assertEquals (expectedRes, actualRes, 0.001);
    }
}