package zad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <E> void appendFromEnd(ArrayList<? super E> list1) {
        ArrayList<E> reverseArr = new ArrayList<>();

        for (int i = list1.size() - 1; i >= 0; i--) {
            reverseArr.add((E) list1.get(i));
        }

        list1.clear();
        list1.addAll(reverseArr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        appendFromEnd(list1);
        System.out.println(list1);
    }
}
