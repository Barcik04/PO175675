package F2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static <T> ArrayList<T> removeMinMax(TreeSet<T> setA) {
        if (setA == null) return null;

        if (setA.size() - 1 < 2) {
            return new ArrayList<>(setA);
        }

        ArrayList<T> minMaxArr = new ArrayList<>();
        minMaxArr.add(setA.first());
        minMaxArr.add(setA.last());

        return minMaxArr;
    }

    public static void main(String[] args) {
        TreeSet<Integer> setA = new TreeSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 1, 1, 1 ,1 ));
        TreeSet<Integer> setLesserThanTwo = new TreeSet<>(List.of(1));
        TreeSet<Integer> nullish = null;

        System.out.println(removeMinMax(setA));
        System.out.println(removeMinMax(setLesserThanTwo));
        System.out.println(removeMinMax(nullish));
    }
}
