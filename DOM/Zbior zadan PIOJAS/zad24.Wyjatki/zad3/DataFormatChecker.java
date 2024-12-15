package zad3;

import java.util.regex.Pattern;

public class DataFormatChecker {
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        String emailPattern = "^[\\w.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!Pattern.matches(emailPattern, dane)) {
            throw new NiepoprawnyFormatDanychException("Podany email: " + dane + " nie istnieje");
        }
        System.out.println("Poprawny email: " + dane);
    }

    public static void main(String[] args) {
        String[] testInputs = {"example@gmail.com", "invalid-email", "test@domain", "user@domain.com"};

        for (String input : testInputs) {
            try {
                sprawdzFormatDanych(input);
            } catch (NiepoprawnyFormatDanychException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
