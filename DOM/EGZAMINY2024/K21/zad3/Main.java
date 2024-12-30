package zad3;

public class Main {
    public static <T> boolean areBothNonNull(T a, T b) {
        return a != null && b != null;
    }

    public static void main(String[] args) {
        System.out.println(areBothNonNull("12", null));
        System.out.println(areBothNonNull(null, null));
        System.out.println(areBothNonNull(1, 2));

    }
}
