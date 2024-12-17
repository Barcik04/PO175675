package zad2;

public class Equal {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(1, 2));
        System.out.println(isEqual(0, 0));
    }
}
