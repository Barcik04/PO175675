package B2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public int findMax(Iterable<Integer> numbers) {
        List<Integer> list = new ArrayList<>();

        for (Integer number : numbers) {
            list.add(number);
        }

        return Collections.max(list);
    }


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 1, 2, 44, 23, 11));

        Main main = new Main();
        System.out.println(main.findMax(numbers));
    }
}
