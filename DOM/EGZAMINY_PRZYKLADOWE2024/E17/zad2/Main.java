package zad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Igor", 2.91),
                new Student(2, "Mika", 3.89),
                new Student(3, "Nikola", 4.89),
                new Student(4, "Sam", 3.89),
        };

        Arrays.sort(students, new AvarageGradeComparator().thenComparing(new IdComparator()));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
