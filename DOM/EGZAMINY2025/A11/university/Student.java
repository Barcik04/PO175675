package university;

import java.util.*;

public class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grade;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 4.0));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Alice", 4.0));
        students.add(new Student("Charlie", 3.8));
        students.add(new Student("Alice", 4.0));

        Iterator<Student> iterator = students.iterator();

        Student target = new Student("Alice", 4.0);

        long result = Main.countElements(iterator, target);
        System.out.println(result);
    }
}


