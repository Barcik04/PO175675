package K4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static <K, V> boolean compareMaps(HashMap<K, V> map1, HashMap<K, V> map2) {
        if (map1.size() != map2.size()) return false;

        for (Map.Entry<K, V> entry : map1.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !map2.get(entry.getKey()).equals(entry.getValue())) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("b", 2);
        map2.put("c", 3);

        boolean result = compareMaps(map1, map2);
        System.out.println(result);
    }
}
