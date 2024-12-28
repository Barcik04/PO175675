package L3;

import java.util.TreeMap;

public class Main {
    public static <K> double calculateAvarageValue(TreeMap<K, Double> map) {
        double sum = 0;

        for (Double value : map.values()) {
            sum += value;
        }

        return sum / map.size();
    }

    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();
        map.put("A", 1.0);
        map.put("B", 2.0);
        map.put("C", 3.0);
        map.put("D", 4.0);

        System.out.println(calculateAvarageValue(map));
    }
}
