package zad4;

import java.util.HashSet;

public class Algorithm {
    public <E> boolean isSubset(HashSet<E> set1, HashSet<E> set2) {
        return set1.containsAll(set2);
    }
}
