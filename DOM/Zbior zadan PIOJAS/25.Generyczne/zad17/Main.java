package zad17;

public class Main {
    public static <T> void printArray(T[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        for (T i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 2, 6, 1, 3, 9, 1};

        printArray(arr);
    }
}
