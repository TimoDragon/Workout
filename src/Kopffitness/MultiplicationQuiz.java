package Kopffitness;

import java.util.Random;

public class MultiplicationQuiz {
    private int firstNum, secondNum;

    public MultiplicationQuiz() {
        firstNum = (int) (Math.random() * 20 + 1);
        secondNum = (int) (Math.random() * 20 + 1);
    }

    public String getExercise() {
        return firstNum + " * " + secondNum + " = ?";
    }

    public int getResult() {
        return firstNum * secondNum;
    }
}