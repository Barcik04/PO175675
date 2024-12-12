package zad10;

import java.util.ArrayList;
import java.util.Comparator;

public class Student {
    private int id;
    private String name;
    private double avarageGrade;

    public Student(int id, String name, double avarageGrade) {
        this.id = id;
        this.name = name;
        this.avarageGrade = avarageGrade;
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

    public static class avgGradeComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            int result = Double.compare(s2.getAvarageGrade(), s1.getAvarageGrade());
            if (result == 0) {
                return s1.getName().compareTo(s2.getName());
            }
            return result;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "James", 1.5));
        students.add(new Student(2, "Bob", 2.5));
        students.add(new Student(3, "Ahn", 2.5));

        students.sort(new avgGradeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }

}

