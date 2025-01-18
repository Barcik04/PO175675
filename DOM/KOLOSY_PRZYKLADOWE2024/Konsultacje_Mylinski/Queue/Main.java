package Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(6,1,3,7,21,-12,-2));
        GenericQueue<Integer> queue = new GenericQueue<>(list);

        System.out.println(queue.dequeue());

        System.out.println(Arrays.toString(list.toArray()));
        queue.enqueue(116);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
