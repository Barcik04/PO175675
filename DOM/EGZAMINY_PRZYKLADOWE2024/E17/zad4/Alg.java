package zad4;

import java.util.HashMap;

public class Alg {
    public static <K, V> String mapToString(HashMap<K, V> map) {
        if (map == null || map.isEmpty()) {
            return "Empty map";
        }

        StringBuilder str = new StringBuilder();

        for (K key : map.keySet()) {
            str.append(key).append(":").append(map.get(key)).append(", ");
        }

        if (str.length() > 2) {
            str.setLength(str.length() - 2);
        }

        return str.toString();
    }

    public static void main(String[] args) {
        HashMap<Person, Integer> map = new HashMap<>();
        map.put(new Person("Alice"), 30);
        map.put(new Person("Bob"), 25);
        map.put(new Person("Charlie"), 35);
        map.put(new Person("Alice"), 40);

        System.out.println("Map as String:");
        System.out.println(mapToString(map));
    }
}
