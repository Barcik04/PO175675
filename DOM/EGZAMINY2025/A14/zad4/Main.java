package zad4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static <E extends Comparable<E>> ArrayList<E> countGreaterThan(LinkedList<E> arr, E elem) {
        ArrayList<E> result = new ArrayList<>();

        for (E item : arr) {
            if (item.compareTo(elem) > 0) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>(List.of(1, 2, 1, 2, 3, 3, 4, 1));

        System.out.println(Main.countGreaterThan(arr, 2));
    }
}
