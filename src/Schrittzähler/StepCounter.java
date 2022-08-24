package Schrittzähler;

public class StepCounter {
    private String date;
    private int steps;

    public StepCounter(String date) {
        this.date = date;
    }

    public void incrementSteps() {
        steps++;
    }

    public String toString() {
        return "Am " + date + " bin ich " + steps + " Schritte gegangen";
    }
}