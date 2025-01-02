package zad3;

import java.util.Objects;

public class Main {
    public static <T> boolean isEqualOrNull(T a, T b) {
        if (a == null && b == null) return true;

        return Objects.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(isEqualOrNull(null, null));
        System.out.println(isEqualOrNull(null, new Object()));
        System.out.println(isEqualOrNull("Olek", "Olek"));
        System.out.println(isEqualOrNull("Olek", null));
    }
}
