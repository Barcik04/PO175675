package zad4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static <T> int countElements(Collection<T> items, T element) {
        if (items == null) {
            throw new IllegalArgumentException("Array cant be null");
        }

        if (!items.contains(element)) {
            return 0;
        }

        int count = 0;

        for (T item : items) {
            if (item.equals(element)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Alice", 4),
                new Student("Bob", 3),
                new Student("Alice", 4),
                new Student("Charlie", 12),
                new Student("Alice", 4)
        ));

        System.out.println(countElements(students, new Student("Alice", 4)));
    }
}
