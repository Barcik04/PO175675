package zad3;

public class Student implements Comparable<Student> {
    private String name;
    private float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return Float.compare(this.grade, o.grade);
    }

    @Override
    public String toString() {
        return "name: " + name + ", grade: " + grade;
    }
}
