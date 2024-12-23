package zad16;

import java.util.Arrays;

public class Main {
    public static <T extends Comparable<T>> T sortAndReturnFirst(T[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }

        Arrays.sort(arr);

        return arr[0];
    }
}
