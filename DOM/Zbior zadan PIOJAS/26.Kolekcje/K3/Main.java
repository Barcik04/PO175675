package K3;

import java.util.HashMap;

public class Main {
    public static <K, V> void aggregateValuesByKey(HashMap<K, Integer> map, K key, Integer value) {
        map.put(key, map.getOrDefault(key, 0) + value);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        aggregateValuesByKey(map, "a", 10);
        aggregateValuesByKey(map, "b", 20);

        System.out.println(map);
    }
}
