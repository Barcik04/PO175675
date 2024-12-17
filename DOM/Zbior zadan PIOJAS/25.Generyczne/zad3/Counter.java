package zad3;

import java.util.ArrayList;
import java.util.List;

public class Counter<T> {
    private List<T> elements;

    public Counter() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public int getCount() {
        return elements.size();
    }

    public String getElementsAsString() {
        return elements.toString();
    }

    public static void main(String[] args) {
        Counter<Integer> counter = new Counter<>();
        counter.add(10);
        counter.add(20);
        counter.add(30);

        System.out.println("Liczba elementów: " + counter.getCount());
        System.out.println("Elementy: " + counter.getElementsAsString());

        Counter<String> stringCounter = new Counter<>();
        stringCounter.add("Ala");
        stringCounter.add("ma");
        stringCounter.add("kota");

        System.out.println("Liczba elementów: " + stringCounter.getCount());
        System.out.println("Elementy: " + stringCounter.getElementsAsString());
    }
}
