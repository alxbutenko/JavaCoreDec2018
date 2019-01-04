public class App {
    public static void main(String[] args) {
        double startPoint = RangeSetting.setStartPoint ();
        double endPoint = RangeSetting.setEndPoint (startPoint);
        double step = Step.setStep ();

        while (startPoint <= endPoint) {
            System.out.println (startPoint +" | " + Function.calc (startPoint) );
            startPoint += step;
        }
    }
}