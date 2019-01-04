import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RangeSetting {
    public static double setStartPoint() {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
                System.out.print ("Please enter start point of range: ");
                return Double.parseDouble (reader.readLine ());
            } catch (Exception ex) {
                System.out.println ("Please enter number in a valid format (int or double)!");
            }
        }
    }

    public static double setEndPoint(double startPoint) {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
                System.out.print ("Please enter end point of range: ");
                double endPoint = Double.parseDouble (reader.readLine ());

                if (endPoint <= startPoint) {
                    throw new IllegalStateException ();
                } else {
                    return endPoint;
                }

            } catch (IllegalStateException ex) {
                System.out.println ("End point must be more than start point!");
            } catch (Exception ex) {
                System.out.println ("Please enter number in a valid format (int or double)!");
            }
        }
    }
}