package Verschluesselung;

public class ShiftCipher {
    private int key;

    public ShiftCipher(int key) {
        this.key = key;
    }

    public String encipher(String text) {
        String s = "";
        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (c + key > 122) {
                int diff = (c + key ) - 122;
                char nc = (char) (97 + diff-1);
                s = s + nc;
            }
            else {
                char nc = (char) (c + key);
                s = s + nc;
            }
        }

        return s;
    }

    public String decipher(String text) {
        String s = "";
        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (c - key < 97) {
                int diff = 96 -(c - key );
                char nc = (char) (122 - diff);
                s = s + nc;
            }
            else {
                char nc = (char) (c - key);
                s = s + nc;
            }
        }

        return s;
    }
}