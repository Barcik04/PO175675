package zad3;

public class Main {
    public static <T extends Comparable<T>> boolean isFirstLargest(T a, T b, T c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Something is null");
        }

        return a.compareTo(b) > 0 && a.compareTo(c) > 0;
    }

    public static void main(String[] args) {
        System.out.println(isFirstLargest(1, 3, 2));
        System.out.println(isFirstLargest(1, 3, 0));
        System.out.println(isFirstLargest(3, 2, 1));
    }
}
