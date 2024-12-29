package zad4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>(List.of(1, 2, 2, 4, 5, 6, 7));
        ArrayList<Integer> listInt2 = new ArrayList<>(List.of(1, 2, 2, 4, 7, 6, 7));

        Iterator<Integer> iterator = listInt.iterator();
        System.out.println(Alg.isAscendingOrder(iterator));

        Iterator<Integer> iterator1 = listInt2.iterator();
        System.out.println(Alg.isAscendingOrder(iterator1));
    }
}
