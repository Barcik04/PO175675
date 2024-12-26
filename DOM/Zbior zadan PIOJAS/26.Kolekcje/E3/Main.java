package E3;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static <T> HashSet<T> unionSets(HashSet<T> set1, HashSet<T> set2) {
        HashSet<T> unionSet = new HashSet<>(set1);

        unionSet.addAll(set2);

        return unionSet;
    }

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(6, 7, 2, 2, 5, 0));

        System.out.println(unionSets(set1, set2));
    }
}
