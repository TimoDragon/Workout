import BMI.Health;
import Kopffitness.MultiplicationQuiz;
import Password.Password;
import Schrittzähler.StepCounter;
import Songtextsuche.SongTextSearch;

public class App {
    public static void main(String[] args) {
        kopffitness();
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
}