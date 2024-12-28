package H3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Main {
    public static <T> void swapEnds(Deque<T> deque) {
        if (deque == null || deque.size() <= 2) return;

        Deque<T> tempQueue = new ArrayDeque<T>();

        while (!deque.isEmpty()) {
            tempQueue.addLast(deque.removeFirst());
            tempQueue.addFirst(deque.removeLast());
        }

        deque.addAll(tempQueue);
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        swapEnds(deque);

        System.out.println(deque);
    }
}
