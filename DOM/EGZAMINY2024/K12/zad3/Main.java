package zad3;

public class Main {
    public static <T> void echoIfEquivalent(T a, T b, T c) {
        if (a.equals(b) && a.equals(c) && b.equals(c)) {
            System.out.println("Wszystkie trzy są równe");
        } else {
            System.out.println("Nie są rowne");
        }
    }
}
