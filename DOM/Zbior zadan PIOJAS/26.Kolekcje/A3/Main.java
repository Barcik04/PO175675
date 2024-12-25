package A3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public <T> void removeEveryOther(Collection<T> items) {
        for (int i = items.size() - 1; i > 0; i-= 2) {
            items.remove(i);
        }
    }

    public static void main(String[] args) {
        Collection<Integer> items = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));

        Main main = new Main();
        main.removeEveryOther(items);
        System.out.println(items);
    }
}
