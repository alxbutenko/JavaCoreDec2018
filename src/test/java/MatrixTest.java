import org.junit.Assert;

public class MatrixTest {

    @org.junit.Test
    public void createMatrix() {
        Matrix matrix = new Matrix ();

        int size = 5;
        int[][] actual = matrix.createMatrix (size);

        int[][] expected = {{1, 0, 0, 0, 1},
                            {0, 1, 0, 1, 0},
                            {0, 0, 1, 0, 0},
                            {0, 1, 0, 1, 0},
                            {1, 0, 0, 0, 1}};

        Assert.assertArrayEquals (actual, expected);
    }
}