package zad3;

public class Main {
    public static <T> boolean containsDuplicates(T a, T b, T c) {
        return (a.equals(b) || a.equals(c) || b.equals(c));
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicates("1", "2", "1"));
        System.out.println(containsDuplicates("1", "1", "1"));
        System.out.println(containsDuplicates(1, 9, 0));
    }
}
