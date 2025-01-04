package zad4;


public class Main {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8};

        GenericQueue<Integer> gQueue = new GenericQueue<>(list);
        System.out.println(gQueue);

        gQueue.enqueue(9);
        System.out.println(gQueue);

        System.out.println(gQueue.dequeue());
        System.out.println(gQueue);
    }
}
