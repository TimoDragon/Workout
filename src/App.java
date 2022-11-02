import AmbientLight.AmbiLight;
import BMI.Health;
import Fernbedienung.RemoteControl;
import Kopffitness.MultiplicationQuiz;
import Password.Password;
import Schrittzähler.StepCounter;
import Songtextsuche.SongTextSearch;
import Stoppuhr.StopWatch;
import Temperaturgraph.TemperatureGraph;
import TicTacToe.TicTacToe;
import Zwischenablage.Clipboard;

public class App {
    public static void main(String[] args) {

    }

    static void stepCounter() {
        StepCounter counter = new StepCounter("24.08.2022");

        for (int i = 0; i < 1111; i++) {
            counter.incrementSteps();
        }

        System.out.println(counter.toString());
    }

    static void bmi(float weight, float height) {
        System.out.println(Health.bmiString(63, 1.75F));
    }

    static void songText(String title, String interpret) {
        System.out.println(SongTextSearch.getURL("MFG", "Die Fantastischen Vier"));
    }

    static void password(char[] password) {
        char[] pwd_first = "PassWD15!!".toCharArray();
        char[] pwd_weak = "1234567890".toCharArray();
        char[] pwd_strong = "NewPWD16!!".toCharArray();

        Password p = new Password(pwd_first);
        System.out.println(p.changePassword(pwd_first, pwd_weak));
        pwd_first[0] = 'p';
        System.out.println(p.changePassword(pwd_first, pwd_strong));
        pwd_first[0] = 'P';
        System.out.println(p.changePassword(pwd_first, pwd_strong));
    }

    static void kopffitness() {
        MultiplicationQuiz mq = new MultiplicationQuiz();
        System.out.println(mq.getExercise());
        System.out.println("Result: " + mq.getResult());
    }

    static void fernbedienung() {
        RemoteControl rc = new RemoteControl();
        rc.saveChannelName("ARD");

        for (int i = 0; i < 31; i++) {
            System.out.println(rc.getChannelName());
            rc.up();
        }
    }

    static void stopwatch() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            Thread.sleep(1400);
            stopWatch.stop();
            System.out.println(stopWatch.elapsedTime());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    static void tictactoe() {
        TicTacToe t = new TicTacToe();
        t.setMark(2, 2);
        t.setMark(2, 0);
        t.setMark(1, 1);
        System.out.println(t.toString());
    }

    static void clipboard() {
        Clipboard cb = new Clipboard(10);

        // 0 - 10 wird in den Speicher geschrieben. Da 10 nicht reinpasst wird 0 überschrieben
        for (int i = 0; i < 11; i++) {
            cb.copy(i + "");
        }

        System.out.println(cb.toString());
    }

    static void temperatureGraph() {
        TemperatureGraph temperatureGraph = new TemperatureGraph(2022);
        temperatureGraph.addTemperature(-11, 1);
        temperatureGraph.addTemperature(-3, 2);
        temperatureGraph.addTemperature(5, 3);
        temperatureGraph.addTemperature(10, 4);
        temperatureGraph.addTemperature(15, 5);
        temperatureGraph.addTemperature(24, 6);
        temperatureGraph.addTemperature(29, 7);
        temperatureGraph.addTemperature(27, 8);
        temperatureGraph.addTemperature(19, 9);
        temperatureGraph.addTemperature(8, 10);
        temperatureGraph.addTemperature(4, 11);
        temperatureGraph.addTemperature(-5, 12);
        temperatureGraph.plotGraph();
    }

    static void ambiLight() {
        AmbiLight light = new AmbiLight();

        for (int i = 0; i < 100; i++) {
            light.increaseLightness();
            System.out.println(light.getNextColor().toString());
        }
    }
}