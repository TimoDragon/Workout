package TicTacToe;

import java.util.Arrays;

public class TicTacToe {
    private int[] field;
    private boolean wichPlayer;

    public TicTacToe() {
        reset();
    }

    public void reset() {
        field = new int[9];

        Arrays.fill(field, 0);
    }

    public void setMark(int x, int y) {
        if (x >= 3 || y >= 3) {
            return;
        }

        int pos = (y * 3) + x;

        if (!wichPlayer) {
            field[pos] = 1;
        }
        else {
            field[pos] = 2;
        }

        wichPlayer = !wichPlayer;
    }

    public String toString() {
        String s = "";

        for (int i = 1; i < field.length + 1; i++) {
            int num = field[i-1];
            if (num == 0) {
                s = s + " ";
            }
            else if (num == 1) {
                s = s + "X";
            }
            else {
                s = s + "O";
            }

            if (i % 3 == 0 && i != 9) {
                s = s + "\n-+-+-\n";
            }
            else if (i != 9) {
                s = s + "|";
            }
        }


        /*String s = field[0] + "|" + field[1] + "|" + field[2] + "\n"
                + "-+-+-\n"
                + field[3] + "|" + field[4] + "|" + field[5] + "\n"
                + "-+-+-\n"
                + field[6] + "|" + field[7] + "|" + field[8] + "\n";
        s = s.replace("0", " ").replace("1", "X").replace("2", "O");*/

        return s;
    }
}