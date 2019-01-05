public class MatrixTest {

    @org.junit.Test
    public void createMatrix() {
        Matrix matrix = new Matrix ();

        int size = 9;

        int[][] arr = matrix.createMatrix (size);

        for (int i=0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print (arr[i][j] + " ");
            }
            System.out.println ();
        }
    }
}