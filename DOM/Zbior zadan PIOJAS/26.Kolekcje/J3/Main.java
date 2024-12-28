package J3;

import java.util.*;

public class Main {
    public static <K, V> Map<V, List<K>> groupByValue(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<>();

        HashSet<V> set = new HashSet<>(map.values());

        for (V s : set) {
            List<K> valuesList = new ArrayList<>();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (entry.getValue().equals(s)) {
                    valuesList.add(entry.getKey());
                }
            }
            result.put(s, valuesList);
        }

        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 1);
        map.put("c", 1);
        map.put("d", 5);
        map.put("e", 5);

        Map<Integer, List<String>> result = groupByValue(map);
        System.out.println(result);
    }
}
