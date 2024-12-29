package zad4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static <T extends Comparable<T>> T findMax(Collection<T> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("items is null or empty");
        }

        List<T> list = new ArrayList<>(items);

        T max = list.getFirst();

        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
