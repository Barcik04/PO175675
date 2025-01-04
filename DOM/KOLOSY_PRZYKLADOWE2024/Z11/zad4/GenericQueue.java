package zad4;

import java.util.Arrays;

public class GenericQueue<T> {
    private T[] queue;

    public GenericQueue(T[] queue) {
        this.queue = queue != null ? Arrays.copyOf(queue, queue.length) : (T[]) new Object [0];
    }

    public void enqueue(T element) {
        queue = Arrays.copyOf(queue, queue.length + 1);
        queue[queue.length - 1] = element;
        System.out.println("Added element: " + element);
    }

    public T dequeue() {
        System.out.println("dequeueing element: " + queue[0]);
        T element = queue[queue.length - 1];
        queue = Arrays.copyOf(queue, queue.length - 1);

        for (int i = 0; i < queue.length - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[queue.length - 1] = element;
        System.out.print("first element: ");
        return queue[0];
    }

    public T[] getQueue() {
        return queue;
    }

    public void setQueue(T[] queue) {
        this.queue = queue != null ? Arrays.copyOf(queue, queue.length) : (T[]) new Object [0];
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
