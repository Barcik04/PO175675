package zad4;

import java.util.TreeMap;


public class Alg {
    public static <K extends Comparable<K>, V >  TreeMap<V, V> getFirstAndLastEntry(TreeMap<K, V> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        TreeMap<V, V> newMap = new TreeMap<>();
        newMap.put(map.firstEntry().getValue(), map.lastEntry().getValue());

        return newMap;
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 4);
        map.put("c", 3);

        TreeMap<Integer, Integer> result = Alg.getFirstAndLastEntry(map);
        System.out.println(result);
    }
}
