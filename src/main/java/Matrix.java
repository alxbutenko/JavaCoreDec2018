public class Matrix {
    public int[][] createMatrix (int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j) || (i == size - j - 1)) {
                    matrix[i][j] = 1;
                }
                else matrix[i][j] = 0;
            }
        }

        return matrix;
    }
}