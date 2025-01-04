package zad4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Utilities {
    public static <E> void printEverySecond(Collection<E> list) {
        Iterator<E> iterator = list.iterator();
        boolean print = false;

        while (iterator.hasNext()) {
            E element = iterator.next();
            if (print) {
                System.out.println(element);
            }
            print = !print;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        printEverySecond(list);
    }
}
