package zad4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Alg {
    public static <T> void clearIfContains(Collection<T> collection, T element) {
        if (collection == null) {
            throw new IllegalArgumentException("collection is null");
        }

        if (collection.contains(element)) {
            collection.clear();
        }
    }

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(List.of(1, 2,3 , 4, 5));
        clearIfContains(collection, 9);

        System.out.println(collection);

        clearIfContains(collection, 1);

        System.out.println(collection);
    }
}
