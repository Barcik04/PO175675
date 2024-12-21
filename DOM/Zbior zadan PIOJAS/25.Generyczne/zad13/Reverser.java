package zad13;

public class Reverser {
    public static <T> void reverseArray(T[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("array cant be empty bozo");
        }


        int left = 0;
        int right = arr.length - 1;


        while (left < right) {
            T temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] arrNull = null;

        reverseArray(arr);
//        reverseArray(arrNull);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
