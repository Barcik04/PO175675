package J1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static <K, V> Map<V, K> reverseMap(Map<K, V> map) {
        Map<V, K> reverseMap = new HashMap<V, K>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        return reverseMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        System.out.println(map);
        Map<Integer, String> result = reverseMap(map);
        System.out.println(result);
    }
}
