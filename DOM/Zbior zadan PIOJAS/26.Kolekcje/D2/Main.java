package D2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static <T> LinkedList<T> findCommonElements(LinkedList<T> list1, LinkedList<T> list2) {
        HashSet<T> set1 = new HashSet<>(list1);

        HashSet<T> commons = new HashSet<>();

        for (T t : list2) {
            if (set1.contains(t)) {
                commons.add(t);
            }
        }

        return new LinkedList<>(commons);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        LinkedList<Integer> list2 = new LinkedList<>(List.of(6, 7, 1, 1, 5, 5, 5, 5));

        System.out.println(findCommonElements(list1, list2));
    }
}
