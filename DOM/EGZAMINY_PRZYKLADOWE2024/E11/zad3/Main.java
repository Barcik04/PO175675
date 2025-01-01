package zad3;

import java.util.Arrays;

public class Main {
    public static <T extends Comparable<T>> T maxValue(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("BMW", 311),
                new Vehicle("Fiat", 51),
                new Vehicle("BMW", 199)
        };

        System.out.println(maxValue(vehicles));
    }
}
