package L1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K start, K end) {
        return new TreeMap<>(map.subMap(start, true, end, true));
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        TreeMap<String, Integer> result = subMapInRange(map, "b", "d");
        System.out.println(result);
    }
}
