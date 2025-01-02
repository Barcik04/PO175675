package zad3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public <T extends Comparable<T>> T findMin(T a, T b, T c) {
        ArrayList<T> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        return Collections.min(arr);
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.findMin(8, 1, -19));
    }
}
