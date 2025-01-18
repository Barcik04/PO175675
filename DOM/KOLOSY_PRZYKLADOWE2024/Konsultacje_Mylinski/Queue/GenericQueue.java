package Queue;

import java.util.ArrayList;

public class GenericQueue<T> {
    private ArrayList<T> queue;

    public GenericQueue(ArrayList<T> queue) {
        this.queue = queue;
    }

    public ArrayList<T> getQueue() {
        return queue;
    }

    public void setQueue(ArrayList<T> queue) {
        this.queue = queue;
    }

    public void enqueue(T element) {
        queue.add(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }
}
