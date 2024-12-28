package M1;

import java.util.List;
import java.util.Vector;

public class Main {
    public static <T> Vector<T> concatenateVectors(Vector<T> a, Vector<T> b) {
        Vector<T> concatenatedVector = new Vector<>(a);
        concatenatedVector.addAll(b);

        return concatenatedVector;
    }

    public static void main(String[] args) {
        Vector<Integer> a = new Vector<>(List.of(1, 2, 3, 4, 5, 7, 8));
        Vector<Integer> b = new Vector<>(List.of(1, 2, 3, 4, 5, 7, 8));

        System.out.println(concatenateVectors(a, b));
    }
}
