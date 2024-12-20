package zad11;

import java.util.ArrayList;

public class GenericQueue<T> {
    private ArrayList<T> arr = new ArrayList<>();

    public void enqueue(T t) {
        arr.add(t);
    }

    public T dequeue() {
        return arr.removeFirst();
    }

    public ArrayList<T> getArr() {
        return arr;
    }

    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.getArr());
    }
}
