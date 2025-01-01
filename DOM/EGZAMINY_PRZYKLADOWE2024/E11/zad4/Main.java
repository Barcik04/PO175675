package zad4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public <T> int countElements(Iterator<T> items, T element) {
        int count = 0;

        while (items.hasNext()) {
            if (items.next().equals(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Igor", 4.9));
        students.add(new Student("Mike", 3.8));
        students.add(new Student("Jack", 4.9));
        students.add(new Student("Igor", 4.9));

        Main main = new Main();
        System.out.println(main.countElements(students.iterator(), students.getFirst()));
    }
}
