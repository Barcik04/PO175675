package M3;

import java.util.Vector;
import java.util.function.Predicate;

public class Main {
    public static <T> Vector<T> filterVector(Vector<T> vector, Predicate<T> predicate) {
        Vector<T> filteredVector = new Vector<>();

        for (T element : vector) {
            if (predicate.test(element)) {
                filteredVector.add(element);
            }
        }

        return filteredVector;
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        Vector<Integer> filteredVector = filterVector(vector, isEven);

        System.out.println("Original Vector: " + vector);       // Output: [1, 2, 3, 4, 5]
        System.out.println("Filtered Vector: " + filteredVector); // Output: [2, 4]
    }
}

