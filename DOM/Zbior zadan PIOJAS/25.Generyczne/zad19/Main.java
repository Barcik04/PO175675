package zad19;

public class Main {
    public static <T> boolean compareElements(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        boolean resultChar = Main.compareElements('s','s');
        System.out.println(resultChar);
    }
}
