package zad4;

import java.util.HashSet;
import java.util.List;

public class Alg {
    public <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2) {
        if (set1 == null || set2 == null) {
            throw new IllegalArgumentException("Arrays cannot be null");
        }

        for (E e : set1) {
            if (set2.contains(e)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
        HashSet<Integer> set2 = new HashSet<>(List.of(1, 2, 3, 1));
        HashSet<Integer> set3 = new HashSet<>(List.of(9, 11, 21));
        try {
            Alg alg = new Alg();
            System.out.println(alg.checkDisjoint(set1, set2));
            System.out.println(alg.checkDisjoint(set1, set3));
            System.out.println(alg.checkDisjoint(set1, null));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
