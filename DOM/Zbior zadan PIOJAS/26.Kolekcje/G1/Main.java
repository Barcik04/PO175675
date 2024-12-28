package G1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) return;

        T front = queue.poll();

        reverseQueue(queue);

        queue.offer(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(List.of(1, 2, 3, 4, 5));

        reverseQueue(queue);

        System.out.println(queue);
    }
}
