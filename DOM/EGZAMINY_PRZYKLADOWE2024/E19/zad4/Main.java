package zad4;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Person, Integer> map = new TreeMap<>();
        map.put(new Person("Igor"), 1);
        map.put(new Person("Mike"), 2);
        map.put(new Person("Jack"), 3);
        map.put(new Person("Jack"), 4);
        map.put(new Person("Jack"), 5);

        System.out.println(Alg.mapToString(map));
    }
}
