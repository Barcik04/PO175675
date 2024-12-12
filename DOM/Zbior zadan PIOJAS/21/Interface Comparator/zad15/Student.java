package zad15;

import java.util.ArrayList;
import java.util.Comparator;

public class Student {
    private int id;
    private String name;
    private double avarageGrade;

    public Student(double avarageGrade, String name, int id) {
        this.avarageGrade = avarageGrade;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAvarageGrade() {
        return avarageGrade;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", avarageGrade: " + avarageGrade;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Cock", 1));
        students.add(new Student(3, "Bob", 2));
        students.add(new Student(3, "Jack", 0));

        students.sort(
                Comparator.comparing(Student::getAvarageGrade, Comparator.reverseOrder()).thenComparing(Student::getId)
        );

        for (Student stu : students) {
            System.out.println(stu);
        }
    }
}
