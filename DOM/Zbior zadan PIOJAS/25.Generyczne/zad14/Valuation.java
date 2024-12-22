package zad14;

public class Valuation {
    public static <T extends Comparable<T>> T minValue(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        T minVal = arr[0];

        for (T i : arr) {
            if (i.compareTo(minVal) < 0) {
                minVal = i;
            }
        }

        return minVal;
    }
}
