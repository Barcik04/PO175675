package A1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static <T> void printUnique(Collection<T> items) {
        ArrayList<T> uniqueArr = new ArrayList<>();

        for (T item : items) {
            if (!uniqueArr.contains(item)) {
                uniqueArr.add(item);
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        Collection<Integer> colArr = List.of(1, 2, 3, 1, 2);

        printUnique(colArr);
    }
}
