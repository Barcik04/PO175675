package K1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map) {
        HashMap<V, Integer> countOccurrencesMap = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();

            countOccurrencesMap.put(value, countOccurrencesMap.getOrDefault(value, 0) + 1);
        }

        return countOccurrencesMap;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "olek");
        map.put("b", "olek");
        map.put("c", "olek");
        map.put("d", "bambi");

        Main main = new Main();
        HashMap<String, Integer> result = main.countValueOccurrences(map);

        System.out.println(result);
    }
}
