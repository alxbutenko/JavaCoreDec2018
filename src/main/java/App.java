public class App {
    private static final double minEpsilon = 0.25;

    public static void main (String[] args) {
        final double epsilon;
        epsilon = Epsilon.getEpsilon ();

        if (epsilon >= minEpsilon) {
            System.out.println ("Every element of the row is lower than \"epsilon\" (" + epsilon+")");
        }
        else {
            ResultOutput.outputRow (epsilon);
        }
    }
}