package moto;

public class Main {
    public static <T extends Comparable<T>> T maxValue(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        T maxObj = arr[0];

        for (T v : arr) {
            if (v.compareTo(maxObj) > 0) {
                maxObj = v;
            }
        }

        return maxObj;
    }
}
