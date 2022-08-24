import Schrittzähler.StepCounter;

public class App {
    public static void main(String[] args) {
        StepCounter counter = new StepCounter("24.08.2022");

        for (int i = 0; i < 1111; i++) {
            counter.incrementSteps();
        }

        System.out.println(counter.toString());
    }
}