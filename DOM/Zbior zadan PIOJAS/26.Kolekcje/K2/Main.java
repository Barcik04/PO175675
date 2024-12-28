package K2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static <K, V> HashMap<V, K> swapKeysAndValues(HashMap<K, V> map) {
        HashMap<V, K> map2 = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            map2.put(entry.getValue(), entry.getKey());
        }

        return map2;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        HashMap<Integer, String> result = swapKeysAndValues(map);
        System.out.println(result);
    }
}
