import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Epsilon {
    public static double getEpsilon() {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
                System.out.print ("Please enter \"epsilon\" in int or float format ('0' or '0.0'): ");
                return Double.parseDouble (reader.readLine ());
            }
            catch (Exception ex) {
                System.out.println ("Please enter number in a valid format!");
            }
        }
    }
}