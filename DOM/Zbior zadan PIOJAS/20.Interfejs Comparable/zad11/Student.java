package zad11;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String name;
    private double avarageGrade;
    private int yearOfStudy;

    public Student(String name, double avarageGrade, int yearOfStudy) {
        this.name = name;
        this.avarageGrade = avarageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public double getAvarageGrade() {
        return avarageGrade;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public int compareTo(Student other) {
        if (this.avarageGrade != other.avarageGrade) {
            return Double.compare(other.avarageGrade, this.avarageGrade);
        }
        return Integer.compare(this.yearOfStudy, other.yearOfStudy);
    }

    @Override
    public String toString() {
        return "name: " + name + " avarageGrade: " + avarageGrade + ", yearOfStudy: " + yearOfStudy;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("John Smith", 3.5, 1),
                new Student("Bill Cosby", 3.5, 2),
                new Student("Jill Williams", 5, 3)
        };

        Arrays.sort(students);

        for (Student stud : students) {
            System.out.println(stud);
        }
    }
}
