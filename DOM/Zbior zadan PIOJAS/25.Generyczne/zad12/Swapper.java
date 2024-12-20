package zad12;

public class Swapper {
    public static <T> void swap(T[] arr, int x, int y) {
        if (x > arr.length - 1 || y > arr.length - 1 || x < 0 || y < 0) {
            System.out.println("Invalid index");
            return;
        }
        T temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 5, 6, 4};

        Swapper.swap(arr, 1, 5);

        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
