package zad4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Person, Integer> map = new HashMap<>();
        map.put(new Person("Alice"), 1);
        map.put(new Person("Alice"), 1);
        map.put(new Person("Charlie"), 1);
        map.put(new Person("Alice"), 1);

        System.out.println(Alg.countUniqueKeys(map));
    }
}
