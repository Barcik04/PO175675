package zad3;

public class Main {
    public static <T> void echoIfEquivalent(T a, T b, T c) {
        if (a.equals(b) && a.equals(c) && b.equals(c)) {
            System.out.println("Wszystkie trzy są rownowazne");
        }
    }

    public static void main(String[] args) {
        echoIfEquivalent(12, "12", "12");
        echoIfEquivalent("12", "12", "12");

    }
}
