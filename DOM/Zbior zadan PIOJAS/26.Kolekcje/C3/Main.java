package C3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static <T> int countOccurrences(ArrayList<T> arr, T element) {
        HashMap<T, Integer> map = new HashMap<>();

        for (T item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        return map.getOrDefault(element, 0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 3, 1, 2, 1, 1, 1, 1, 2, 2, 2));

        int result = countOccurrences(arr, 1);
        System.out.println(result);
    }
}
