package zad3;

public class Main {
    public static <T extends Comparable<T>> T lastMaxValue(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) >= 0) {
                max = item;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3,4 , 7, 6,7 };
        System.out.println(lastMaxValue(array));
    }
}
