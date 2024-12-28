package I1;

import java.util.PriorityQueue;

public class Main {
    public static <T extends Comparable<T>> PriorityQueue<T> mergePriorityQueues(PriorityQueue<T> pq1, PriorityQueue<T> pq2) {
        PriorityQueue<T> pq = new PriorityQueue<>(pq1);

        pq.addAll(pq2);

        return pq;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(1);
        pq1.add(4);
        pq1.add(1);
        pq1.add(2);
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(2);
        pq2.add(8);
        pq2.add(1);

        PriorityQueue<Integer> result = mergePriorityQueues(pq1, pq2);
        System.out.println(result);

        System.out.println("in Order");
        while (!result.isEmpty()) {
            System.out.println(result.poll() + " ");
        }
    }
}
