package F3;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main {
    public static <T extends Comparable<T>> T findClosestElement(TreeSet<T> set, T target) {
        if (set.isEmpty()) {
            throw new NoSuchElementException("Set is empty");
        }

        T ceiling = set.ceiling(target);
        T floor = set.floor(target);

        ArrayList<T> arr = new ArrayList<>();
        arr.add(ceiling);
        arr.add(floor);
        arr.add(target);
    }

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(List.of(1, 2, 3, 2, 5, 2, 8));
        System.out.println(findClosestElement(set, 5));
    }
}
