package H2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Main {
    public static <T> void removeEverySecond(Deque<T> deque) {
        if (deque == null || deque.isEmpty() || deque.size() == 1) return;

        Deque<T> resultQueue = new ArrayDeque<>();

        boolean keep = true;

        while (!deque.isEmpty()) {
            T element = deque.removeFirst();
            if (keep) {
                resultQueue.add(element);
            }
            keep = !keep;
        }

        deque.addAll(resultQueue);
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));

        removeEverySecond(deque);

        System.out.println(deque);
    }
}
