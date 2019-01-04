import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Step {
    public static double setStep() {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
                System.out.print ("Please enter step: ");
                double step = Double.parseDouble (reader.readLine ());

                if (step <= 0) {
                    throw new IllegalStateException ();
                }
                else {
                    return step;
                }

            } catch (IllegalStateException ex) {
                System.out.println ("Step must be greater than \'0\'!");
            } catch (Exception ex) {
                System.out.println ("Please enter number in a valid format (int or double)!");
            }
        }
    }
}