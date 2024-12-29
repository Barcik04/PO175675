package zad4;

import java.util.Iterator;

public class Alg {
    public static <T extends Comparable<T>> T findMax(Iterator<T> items) {
        T max = items.next();
        while (items.hasNext()) {
            T current = items.next();
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }

        return max;
    }
}
