package J2;

import java.util.*;

public class Main {
    public static <K, V extends Comparable<V>> List<K> findKeysWithMaxValue(Map<K, V> map) {
        List<K> keys = new ArrayList<>();

        V maxValue = Collections.max(map.values());

        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (maxValue.compareTo(entry.getValue()) == 0) {
                keys.add(entry.getKey());
            }
        }

        return keys;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 3);
        map.put("e", 2);

        List<String> result = findKeysWithMaxValue(map);
        System.out.println(result);
    }
}
