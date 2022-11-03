package Mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mastermind {
    private int[] randomColors = new int[4];
    private int spielzüge = 0;

    public Mastermind() {
        Random random = new Random();
        for (int i = 0; i < randomColors.length; i++) {
            randomColors[i] = random.nextInt(6);
            System.out.println(randomColors[i]);
        }
    }

    public int[] guess(int c1, int c2, int c3, int c4) {
        spielzüge++;

        int[] arr = { c1, c2, c3, c4 };
        int[] ret = { correctColorsAndPositions(arr), correctColors(arr) };
        return ret;
    }

    private int correctColorsAndPositions(int[] colors) {
        int counter = 0;
        for (int i = 0; i < randomColors.length; i++) {
            if (randomColors[i] == colors[i]) {
                counter++;
            }
        }

        return counter;
    }

    private int correctColors(int[] colors) {
        List<Integer> availableColors = new ArrayList<>();
        List<Integer> colorsList = new ArrayList<>();

        for (int i = 0; i < randomColors.length; i++) {
            if (!availableColors.contains(randomColors[i])) {
                availableColors.add(randomColors[i]);
            }

            if (!colorsList.contains(colors[i])) {
                colorsList.add(colors[i]);
            }
        }

        int counter = 0;
        for (int i = 0; i < colorsList.size(); i++) {
            if (availableColors.contains(colorsList.get(i))) {
                counter++;
            }
        }

        return counter;
    }
}