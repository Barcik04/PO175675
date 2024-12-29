package zad1;

import java.util.Arrays;

public class Student implements Cloneable{
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }

    public void setGrades(int[] grades) {
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.grades = this.grades.clone();
        return student;
    }

    @Override
    public String toString() {
        return "Name: " + name + "Grades: " + Arrays.toString(grades);
    }
}
