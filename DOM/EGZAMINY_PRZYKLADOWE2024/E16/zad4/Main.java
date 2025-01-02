package zad4;

import java.util.HashMap;

public class Main {
    public static <K, V> V findValueByKey(HashMap<K, V> map, K key) {
        if (key == null) {
            throw new IllegalArgumentException("your key in null (unacceptable)");
        }

        return map.get(key);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);

        System.out.println(findValueByKey(map, "c"));
        System.out.println(findValueByKey(map, "r"));
        System.out.println(findValueByKey(map, null));
    }
}
