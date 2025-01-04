package zad3;

import java.util.Arrays;

public class Main {
    public static <T> void createArray(T a, T b, T[] arr) {
        if (arr == null || arr.length != 2) {
            throw new IllegalArgumentException("The given array is null or is not size of 2");
        }

        arr[0] = a;
        arr[1] = b;
    }

    public static void main(String[] args) {
        Integer[] list = new Integer[2];

        createArray(1, 2, list);
        System.out.println(Arrays.toString(list));
    }
}
