package M2;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class M2 {
    public static <T>Vector<T> reverseVector(Vector<T> v) {
        Vector<T> reversedV = new Vector<>(v);

        Collections.reverse(reversedV);

        return reversedV;
    }

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(List.of(1, 2, 3, 4, 5, 6, 7));

        System.out.println(reverseVector(v));
    }
}
