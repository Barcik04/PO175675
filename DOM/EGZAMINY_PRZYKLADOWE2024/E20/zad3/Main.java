package zad3;

public class Main {
    public static <T extends Comparable<T>> int findMaxIndex(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int indexMax = 0;
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }
}
