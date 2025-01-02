package zad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Igor", 3.1, 2),
                new Student("Raman", 4.2, 2),
                new Student("Mikhail", 3.1, 1),
        };

        Arrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
