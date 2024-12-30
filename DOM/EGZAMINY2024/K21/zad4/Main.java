package zad4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        boolean result = Alg.isListEmpty(list);
        System.out.println(result);
    }
}
