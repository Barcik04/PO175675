package zad2;

import java.util.Arrays;

public class Teacher implements Cloneable{
    private String name;
    private double[] studentsGrades;

    public Teacher(String name, double[] studentsGrades) {
        this.name = name;
        this.studentsGrades = Arrays.copyOf(studentsGrades, studentsGrades.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getStudentsGrades() {
        return Arrays.copyOf(studentsGrades, studentsGrades.length);
    }

    public void setStudentsGrades(double[] studentsGrades) {
        this.studentsGrades = Arrays.copyOf(studentsGrades, studentsGrades.length);
    }

    @Override
    public String toString() {
        return "name: " + name + "age: " + Arrays.toString(studentsGrades);
    }

    @Override
    public Teacher clone() throws CloneNotSupportedException {
        Teacher teacher = (Teacher) super.clone();
        teacher.studentsGrades = Arrays.copyOf(studentsGrades, studentsGrades.length);
        return teacher;
    }
}
