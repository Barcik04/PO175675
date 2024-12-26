package C2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static <T>ArrayList<T> removeDuplicates(ArrayList<T> list) {
        if (list == null || list.isEmpty()) return new ArrayList<>();

        HashMap<T, Integer> map = new HashMap<>();

        for (T i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<T> result = new ArrayList<>();

        for (T i : map.keySet()) {
            result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 5, 1, 2, 2, 1));

        System.out.println(removeDuplicates(list));
    }
}
