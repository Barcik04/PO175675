package zad4;


import java.util.ArrayList;
import java.util.Collection;

public class Alg {
    public static <T> Collection<T> mergeCollections(Collection<T> collection1, Collection<T> collection2) {
        ArrayList<T> result = new ArrayList<>(collection1);
        result.addAll(collection2);

        return result;
    }
}
