package zad3;

public class Main {
    public static <T extends Comparable<T>> boolean isSorted(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 4, 3};
        Integer[] arr3 = {1, 4, 3, 4, 4, 5};

        System.out.println(Main.isSorted(arr1));
        System.out.println(Main.isSorted(arr2));
        System.out.println(Main.isSorted(arr3));
    }
}
