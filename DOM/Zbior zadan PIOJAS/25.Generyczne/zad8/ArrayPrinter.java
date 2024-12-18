package zad8;

public class ArrayPrinter {
    public static <T> void printArray(T[] arr) {
        for (T obj : arr) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 13, 4, 5};

        ArrayPrinter.printArray(arr);
    }
}
