package zad4;

import java.util.LinkedList;
import java.util.List;

public class Alg {
    public static <E> boolean compareFirstAndLast(LinkedList<E> list1) {
        if (list1 == null || list1.size() == 0) {
            throw new IllegalArgumentException("List is null or empty");
        }

        return list1.getFirst().equals(list1.getLast());
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1));
        LinkedList<Integer> list2 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println(compareFirstAndLast(list1));
        System.out.println(compareFirstAndLast(list2));
    }
}
