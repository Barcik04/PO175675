package F1;

import java.util.List;
import java.util.TreeSet;

public class Main {
    public static <T>TreeSet<T> findElementsRange(TreeSet<T> setA, T lowerBound, T upperBound) {
        return new TreeSet<>(setA.subSet(lowerBound, true, upperBound, true));
    }

    public static void main(String[] args) {
        TreeSet<Integer> setA = new TreeSet<>(List.of(1, 2, 3, 4, 5, 4, 4, 4));

        System.out.println(findElementsRange(setA, 2, 4));
    }
}
