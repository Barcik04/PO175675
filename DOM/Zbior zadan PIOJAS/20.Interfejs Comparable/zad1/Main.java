package zad1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Anna", 4.5, 2000),
                new Student("Bartek", 3.8, 1999),
                new Student("Cezary", 5.0, 2001),
                new Student("Daria", 4.2, 2000),
                new Student("Ewa", 4.9, 1998)
        };

        Arrays.sort(students);
        
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
