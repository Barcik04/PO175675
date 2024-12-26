package C1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static <T> ArrayList<T> mergeList(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> newArr = new ArrayList<>();

        int i = list1.size() - 1;
        ArrayList<T> bigger = list1;
        ArrayList<T> smaller = list2;

        if (i < list2.size()) {
            i = list2.size() - 1;
            bigger = list2;
            smaller = list1;
        }

        while (i >= 0) {
            newArr.add(bigger.get(i));
            if (i <= smaller.size() - 1) {
                newArr.add(smaller.get(i));
            }
            i--;
        }

        Collections.reverse(newArr);

        return newArr;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));

        System.out.println(mergeList(list1, list2));


    }
}
