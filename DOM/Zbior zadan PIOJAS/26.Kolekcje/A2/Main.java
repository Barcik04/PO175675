package A2;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static <T> int countOccurrences(Collection<T> items, T element) {
        if (items == null) return 0;

        if (!items.contains(element)) {
            System.out.println("Element not found");
            return 0;
        }

        HashMap<T, Integer> map = new HashMap<>();

        for (T item : items) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        return map.getOrDefault(element, 0);
    }

    public static void main(String[] args) {
        Collection<Double> doubleCollection = List.of(1.0, 1.0, 2.0, 2.0, 2.0, 2.0);

        Integer result = countOccurrences(doubleCollection, 2.0);

        System.out.println(result);
    }
}
