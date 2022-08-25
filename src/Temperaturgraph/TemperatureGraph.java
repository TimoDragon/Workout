package Temperaturgraph;

public class TemperatureGraph {
    private Integer[] temps;
    private int year;

    public TemperatureGraph(int year) {
        this.year = year;
        temps = new Integer[12];
    }

    public void addTemperature(int temp, int month) {
        if (month <= 0 || month > 12) {
            return;
        }

        temps[month-1] = temp;
    }

    public void plotGraph() {
        if (!isCompleted()) {
            System.out.println("Es wurden nicht alle Monate eingetragen");
            return;
        }

        String s = "";

        for (int i = getMaxTemperature(); i > getMinTemperature() - 1; i--) {
            int l = String.valueOf(i).length();
            s += i;
            for (int j = 0; j < 5 - l; j++) {
                s += " ";
            }

            for (int j = 0; j < temps.length; j++) {
                if (temps[j] >= i) {
                    s += "# ";
                }
                else {
                    s += "  ";
                }
            }

            s += "\n";
        }

        System.out.println(s);
    }

    private boolean isCompleted() {
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] == null) {
                return false;
            }
        }

        return true;
    }

    private int getMaxTemperature() {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] != null && temps[i] > max) {
                max = temps[i];
            }
        }

        return max;
    }

    private int getMinTemperature() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] != null && temps[i] < min) {
                min = temps[i];
            }
        }

        return min;
    }
}