package zad5;

public class Maximum {
   public static <T extends Comparable<T>> T max(T[] array) {
       if (array == null || array.length == 0) {
           return null;
       }


       T maxVal = array[0];
       for (T elem : array) {
           if (elem.compareTo(maxVal) > 0) {
               maxVal = elem;
           }
       }
       return maxVal;
   }

   public static void main(String[] args) {
       Integer[] numbers = {1, 2, 5, 2, 6, 7, 1, 4};
       String[] strings = {"one", "two", "three", "four", "wive"};

       System.out.println(max(numbers));
       System.out.println(max(strings));

       Integer[] numNumbers = {};
       System.out.println(max(numNumbers));
   }
}
