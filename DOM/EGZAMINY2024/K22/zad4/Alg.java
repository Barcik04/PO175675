package zad4;

import java.util.TreeMap;

public class Alg {
    public static <K, V extends Comparable<V>> TreeMap<V, K> reverseMap(TreeMap<K, V> map) {
        TreeMap<V, K> revMap = new TreeMap<>();

        for (K key : map.keySet()) {
            revMap.put(map.get(key), key);
        }

        return revMap;
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        TreeMap result = reverseMap(map);
        System.out.println(result);
    }
}
