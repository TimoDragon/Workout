package Password;

import java.util.Arrays;

public class Password {
    private char[] password;

    public Password(char[] password) {
        this.password = password.clone();
    }

    public boolean isStrong() {
        return isStrong(password);
    }

    public boolean isStrong(char[] password) {
        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        boolean number = false;

        for (int i = 0; i < password.length; i++) {
            if (password[i] >= 'a' && password[i] <= 'z') {
                lower = true;
            }
            else if (password[i] >= 'A' && password[i] <= 'Z') {
                upper = true;
            }
            else if (password[i] >= '0' && password[i] <= '9') {
                number = true;
            }
            else if (password[i] >= '!' && password[i] <= '.') {
                special = true;
            }
        }

        return lower && upper && special && number;
    }

    public boolean changePassword(char[] oldPassword, char[] newPassword) {
        if (!Arrays.equals(password, oldPassword)) {
            return false;
        }

        if (!isStrong(newPassword)) {
            return false;
        }

        password = newPassword.clone();
        return true;
    }

    public void deletePassword() {
        password = null;
    }
}