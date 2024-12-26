package B3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> int countElements(Iterable<T> items, Object element) {
        if (items == null) return 0;

        int count = 0;

        for (T item : items) {
            if (item.equals(element)) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 2, 1, 3, 1, 4, 5, 6));

        System.out.println(countElements(list,1));
    }
}
