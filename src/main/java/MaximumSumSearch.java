public class MaximumSumSearch {
    public double searchMaxSum (double[] array) {
        int n = array.length - 1;
        double max = 0;

        for (int i = 0; i < array.length/2; i++) {
            if (array[i] + array[n] > max) {
                max = array[i] + array[n];
            }
            n--;
        }
        return max;
    }
}