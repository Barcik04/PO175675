package zad9;

public class Pair<T1, T2> {
    private T1 a;
    private T2 b;

    public Pair(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    public T1 getFirst() {
        return a;
    }

    public T2 getSecond() {
        return b;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("a", 1);

        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
    }
}
