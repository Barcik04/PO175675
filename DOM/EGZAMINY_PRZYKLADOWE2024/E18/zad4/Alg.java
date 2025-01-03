package zad4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alg {
    public static <T> T atINdex(Iterator<T> iterator, int index) {
        if (iterator == null || index < 0) {
            throw new IllegalArgumentException("NULL or illegal index");
        }

        int indexIter = 0;
        while (iterator.hasNext()) {
            T currentElement = iterator.next();
            if (indexIter == index) {
                return currentElement;
            }
            indexIter++;
        }

        throw new IllegalArgumentException("Index out of bounds");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        
        System.out.println(atINdex(list.iterator(), 2));
    }
}
