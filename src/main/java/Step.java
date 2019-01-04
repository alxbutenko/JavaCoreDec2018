import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Step {
    public static double setStep() {
        while (true) {
            try {
                BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
                System.out.print ("Please enter step: ");
                return Double.parseDouble (reader.readLine ());
            } catch (Exception ex) {
                System.out.println ("Please enter number in a valid format (int or double)!");
            }
        }
    }
}