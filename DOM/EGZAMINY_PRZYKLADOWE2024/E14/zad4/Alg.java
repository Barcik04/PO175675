package zad4;

import java.util.HashMap;
import java.util.HashSet;

public class Alg {
    public static <K, V> int countUniqueKeys(HashMap<K, V> map) {
        HashSet<K> uniqueSet = new HashSet<>(map.keySet());
        return uniqueSet.size();
    }
}
