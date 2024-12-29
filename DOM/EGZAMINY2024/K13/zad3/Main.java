package zad3;

public class Main {
    public static <T> boolean isEitherNull(T a, T b) {
        return a == null || b == null;
    }

    public static void main(String[] args) {
        System.out.println(isEitherNull(null, null));
        System.out.println(isEitherNull(null, "Olek"));
        System.out.println(isEitherNull("Bolek", "Olek"));
    }
}
