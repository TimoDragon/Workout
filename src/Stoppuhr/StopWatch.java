package Stoppuhr;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public void start() {
        if (startTime == 0) {
            startTime = System.currentTimeMillis();
        }
    }

    public void stop() {
        if (stopTime == 0) {
            stopTime = System.currentTimeMillis();
        }
    }

    public float elapsedTime() {
        if (stopTime != 0) {
            return (float) (stopTime - startTime) / 1000;
        }

        return (float) (System.currentTimeMillis() - startTime) / 1000;
    }
}