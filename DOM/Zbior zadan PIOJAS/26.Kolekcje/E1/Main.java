package E1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static <T> HashSet<T> findUniqueElements(List<T> list) {
        return new HashSet<>(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 4, 4, 12, 1, 1));
        HashSet<Integer> uniqueHash = findUniqueElements(list);
        System.out.println(uniqueHash);
    }
}
