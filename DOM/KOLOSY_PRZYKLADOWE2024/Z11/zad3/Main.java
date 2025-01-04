package zad3;

import java.util.Arrays;

public class Main {
    public static <T extends Comparable<T>> T findMedian(T[] list) {
        if (list == null || list.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        Arrays.sort(list);

        return list[list.length / 2];
    }

    public static void main(String[] args) {
        Student[] students = {
               new Student("Igor", 5),
               new Student("Mike", 3),
               new Student("Youbel", 2),
                new Student("Golle", 3.5f)
        };

        System.out.println(findMedian(students));
    }
}
