package zad3;

public class Main {
    public static <T> void displayIfDistinct(T a, T b, T c) {
        if (!(a.equals(b) || a.equals(c) || b.equals(c))) {
            System.out.println("wszystkie trzy sa rozne");
        }
    }

    public static void main(String[] args) {
        System.out.println("1");
        displayIfDistinct("a", "b", "b");
        System.out.println("2");
        displayIfDistinct("c", "c", "c");
        System.out.println("3");
        displayIfDistinct("a", "b", "c");
    }
}
