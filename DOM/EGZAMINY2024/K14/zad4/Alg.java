package zad4;

import java.util.Iterator;

public class Alg {
    public static <T extends Comparable<T>> boolean isAscendingOrder(Iterator<T> items) {
        if (items == null) {
            throw new IllegalArgumentException("items cannot be null");
        }

        T smaller = items.next();
        while (items.hasNext()) {
            T temporary = items.next();
            if (temporary.compareTo(smaller) < 0) {
                return false;
            }
            smaller = temporary;
        }
        return true;
    }
}
