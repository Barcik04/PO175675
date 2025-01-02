package zad3;

public class Main {
    public static <T> T findFirstNonNull(T[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("array is null");
        }

        for (T item : arr) {
            if (item != null) {
                return item;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Integer[] arr = {null, null, 4, 5};

        System.out.println(findFirstNonNull(arr));
    }
}
