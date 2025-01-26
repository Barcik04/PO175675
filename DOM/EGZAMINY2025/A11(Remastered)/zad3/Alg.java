package zad3;

public class Alg {
    public static <T extends Comparable<T>> T maxValue(T[] arr) {
        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
