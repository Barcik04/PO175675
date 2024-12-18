package zad10;

public class Swapper {
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5, 6};
        String[] arrStr = {"ogor", "chlor", "bombka"};

        Swapper.swap(arrInt, 0, 4);

        Swapper.swap(arrStr, 0, 2);

        for (Integer i : arrInt) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (String i : arrStr) {
            System.out.print(i + " ");
        }
    }
}
