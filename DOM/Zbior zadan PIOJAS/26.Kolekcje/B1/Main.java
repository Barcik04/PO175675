package B1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public <T> void reversePrint(Iterable<T> items) {
        List<T> itemList = new ArrayList<>();

        for (T item : items) {
            itemList.add(item);
        }

        Collections.reverse(itemList);

        for (T item : itemList) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Main main = new Main();
        main.reversePrint(list);
    }
}
