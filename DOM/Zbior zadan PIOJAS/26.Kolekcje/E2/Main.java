package E2;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static <T> boolean hasCommonElements(HashSet<T> setA, HashSet<T> setB) {
        for (T element : setA) {
            if (setB.contains(element)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>(List.of(1, 2, 3, 4, 2, 2, 2));
        HashSet<Integer> setB = new HashSet<>(List.of(1, 872, 30, 94));

        System.out.println(hasCommonElements(setA, setB));
    }
}
