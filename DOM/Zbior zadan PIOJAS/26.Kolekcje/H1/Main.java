package H1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Main {
    public static <T> boolean isSymetric(Deque<T> deque) {
        if (deque == null || deque.isEmpty() || deque.size() == 1) return true;

        if (!deque.getFirst().equals(deque.getLast())) {
            return false;
        }
        deque.removeFirst();
        deque.removeLast();

        return isSymetric(deque);
    }

    public static void main(String[] args) {
        Deque<Integer> dequeTrue = new ArrayDeque<>(List.of(1, 2, 3, 4, 3, 2, 1));
        Deque<Integer> dequeFalse = new ArrayDeque<>(List.of(1, 2, 3, 4, 2, 2, 2, 1));

        System.out.println(isSymetric(dequeTrue));
        System.out.println(isSymetric(dequeFalse));
    }
}
