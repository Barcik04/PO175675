package L2;

import java.util.Collections;
import java.util.TreeMap;

public class Main {
    public static <K, V> TreeMap<K, V> reverseOrderMap(TreeMap<K, V> map) {
        TreeMap<K, V> reverseMap = new TreeMap<>(Collections.reverseOrder());

        reverseMap.putAll(map);

        return reverseMap;
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        System.out.println(reverseOrderMap(map));
    }
}
