package zad3;

public class Main {
    public static <T> boolean isExactlyOneNull(T a, T b) {
        return a == null && b != null || a != null && b == null;
    }

    public static void main(String[] args) {
        System.out.println(isExactlyOneNull(null, null));
        System.out.println(isExactlyOneNull(null, "bobo"));
        System.out.println(isExactlyOneNull("kobula", "bobo"));
    }
}
