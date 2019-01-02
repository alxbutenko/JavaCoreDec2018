public class ResultOutput {
    public static void outputRow(double epsilon) {
        double aN;
        int indexN = 0;

        Calculator calc = new Calculator ();

        do {
            indexN++;
            aN = calc.calculateAn (indexN);
            System.out.println (indexN + " element of the row is: " + aN);
        } while (aN >= epsilon);

        System.out.println ("The lowest index is: " + indexN);
    }
}