package zad1;

import java.util.ArrayList;

public class Student implements Cloneable{
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades != null ? new ArrayList<>(grades) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades != null ? new ArrayList<>(grades) : new ArrayList<>();
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.grades = new ArrayList<>(grades);
        return cloned;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Grade: " + grades;
    }
}
