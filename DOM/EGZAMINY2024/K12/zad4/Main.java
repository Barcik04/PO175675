package zad4;

import java.util.HashSet;
import java.util.List;

public class Main {
    public <E> boolean checkDesjoint(HashSet<E> set1, HashSet<E> set2) {
        for (E e : set1) {
            if (set2.contains(e)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(6, 7, 8, 9, 10));
        HashSet<Integer> set3 = new HashSet<>(List.of(1, 2, 3, 4, 5));

        Main main = new Main();
        System.out.println(main.checkDesjoint(set1, set2));
        System.out.println(main.checkDesjoint(set1, set3));
    }
}
