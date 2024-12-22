package zad15;

public class Main {
    public static <T extends Comparable<T>> T maxValue(T[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("arr is empty");
        }

        T max = arr[0];

        for (T i : arr) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }

        return max;
    }
}
