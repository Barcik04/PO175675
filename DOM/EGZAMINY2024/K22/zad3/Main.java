package zad3;

import java.util.*;

public class Main {
    public static <T extends Comparable<T>> T mostFrequent(Set<T> set) {
        if (set == null || set.isEmpty()) {
            throw new IllegalArgumentException("set is null or empty");
        }
        HashMap<T, Integer> map = new HashMap<>();

        for (T item : set) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        T mostFrequent = null;
        int maxOccurences = 0;
        for (T item : set) {
            int freq = map.get(item);
            if (freq >= maxOccurences) {
                maxOccurences = freq;
                mostFrequent = item;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 3, 2, 3, 3, 2, 2, 2));
// cos jest nie tak w tym zadaniu
        System.out.println(mostFrequent(set));
    }
}
