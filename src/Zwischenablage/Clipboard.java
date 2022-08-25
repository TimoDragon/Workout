package Zwischenablage;

public class Clipboard {
    private String[] storage;
    private int newest;

    public Clipboard(int size) {
        storage = new String[size];
        newest = 0;
    }

    public void copy(String s) {
        boolean added = false;
        if (storage.length == newest) {
            storage[0] = null;
            for (int i = 1; i < storage.length; i++) {
                storage[i-1] = storage[i];
            }
            storage[newest-1] = s;

            return;
        }

        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = s;
                newest++;
                break;
            }
        }
    }

    public String paste() {
        if (newest == 0) {
            return null;
        }

        String s = storage[newest-1];
        storage[newest-1] = null;
        newest--;

        return s;
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < storage.length; i++) {
            s += storage[i];

            if (i < storage.length-1) {
                s += ", ";
            }
        }
        s += "]";

        return s;
    }
}