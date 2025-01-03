package zad4;

import java.util.Map;
import java.util.TreeMap;

public class Alg {
    public static <K, V> String mapToString(TreeMap<K, V> map) {
        String str = "";

        for(Map.Entry<K, V> entry : map.entrySet()) {
            str += entry.getKey() + ": " + entry.getValue() + ", ";
        }

        if (str.length() > 2) {
            str = str.substring(0, str.length() - 2);
        }

        return str;
    }
}
