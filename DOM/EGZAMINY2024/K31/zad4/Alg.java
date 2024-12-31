package zad4;

import java.util.TreeSet;

public class Alg {
    public static <E> int compareSets(TreeSet<E> setOne, TreeSet<E> setTwo) {
        int countCommon = 0;

        for (E e : setOne) {
            if (setTwo.contains(e)) {
                countCommon++;
            }
        }

        return countCommon;
    }

    public static void main(String[] args) {
        TreeSet<Integer> setOne = new TreeSet<>();
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOne.add(4);

        TreeSet<Integer> setTwo = new TreeSet<>();
        setTwo.add(1);
        setTwo.add(2);
        setTwo.add(3);

        System.out.println(compareSets(setOne, setTwo));
    }
}
