package G2;

import java.util.LinkedList;
import java.util.Queue;

public class Customer {
    public static <T extends Customer> int simulateSupermarketQueue(Queue<T> queue) {
        if (queue.isEmpty()) return 0;

        queue.poll();
        return 1 + simulateSupermarketQueue(queue);
    }

    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        queue.add(new Customer());
        queue.add(new Customer());
        queue.add(new Customer());

        System.out.println(simulateSupermarketQueue(queue));
    }
}
