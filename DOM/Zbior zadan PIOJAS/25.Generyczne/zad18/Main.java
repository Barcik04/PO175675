package zad18;

import java.util.Collection;
import java.util.List;

public class Main {
    public static <T extends Number> double sumElements(Collection<T> elems) {
        double sum = 0;

        for (T elem : elems) {
            sum += elem.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        Collection<Integer> intCollection = List.of(1, 2, 3, 4, 5);
        System.out.println(sumElements(intCollection));
    }
}
