package zad4;

import java.util.HashMap;

public class Main {
    public static <K, V> HashMap<K, V> mergeMaps(HashMap<K, V> h1, HashMap<K, V> h2) {
        HashMap<K, V> h3 = new HashMap<>();

        h3.putAll(h1);
        h3.putAll(h2);

        return h3;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> h1 = new HashMap<>();
        h1.put("a", 1);
        h1.put("b", 2);
        h1.put("c", 3);

        HashMap<String, Integer> h2 = new HashMap<>();
        h2.put("a", 3);
        h2.put("e", 2);
        h2.put("w", 3);

        System.out.println(mergeMaps(h1, h2));
    }
}
