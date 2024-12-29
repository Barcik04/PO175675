package zad3;

    public class Main {
        public static <T extends Comparable<T>> T firstMinValue(T[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array is null or empty");
            }

            T min = arr[0];
            for (T item : arr) {
                if (item.compareTo(min) < 0) {
                    min = item;
                }
            }

            return min;
        }
    }
