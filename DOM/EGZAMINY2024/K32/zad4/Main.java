package zad4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static <T> void filterUnique(Collection<T> items) {
        Map<T, Integer> map = new HashMap<>();

        for (T item : items) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        items.removeIf(item -> map.get(item) > 1);
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mike", "Blacksmith"));
        students.add(new Student("Chris", "Blacksmith"));
        students.add(new Student("Mike", "Killer"));

        Main.filterUnique(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
