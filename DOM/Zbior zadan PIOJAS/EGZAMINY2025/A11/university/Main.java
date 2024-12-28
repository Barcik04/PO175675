package university;

import java.util.Iterator;
import java.util.stream.StreamSupport;

public class Main {
    public static <T> long countElements(Iterator<T> items, T element) {
//        int count = 0;
//
//        while (items.hasNext()) {
//            if (items.next().equals(element)) {
//                count++;
//            }
//        }
//
//        return count;
        return StreamSupport.stream(((Iterable<T>) () -> items).spliterator(), false)
                .filter(e -> e.equals(element)) // Use a lambda to check equality
                .count(); // Count matching elements
    }
}
