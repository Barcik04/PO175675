package zad15;

import java.util.ArrayList;

public class Teacher implements Cloneable{
    private String name;
    private ArrayList<Integer> studentsGrades;

    public Teacher(String name, ArrayList<Integer> studentsGrades) {
        this.name = name;
        this.studentsGrades = studentsGrades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getStudentsGrades() {
        return studentsGrades;
    }

    public void setStudentsGrades(ArrayList<Integer> studentsGrades) {
        this.studentsGrades = studentsGrades;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Teacher teacher = (Teacher) super.clone();
        teacher.studentsGrades = new ArrayList<>(this.studentsGrades);
        return teacher;
    }

    @Override
    public String toString() {
        return "name: " + name + ", studentsGrades: " + studentsGrades;
    }

    public static void main(String[] args) {
        ArrayList<Integer> studentsGrades = new ArrayList<>();
        studentsGrades.add(4);
        studentsGrades.add(2);
        studentsGrades.add(5);
        studentsGrades.add(4);
        studentsGrades.add(5);

        Teacher t1 = new Teacher("Pakulski", studentsGrades);

        try {
            Teacher t2 = (Teacher) t1.clone();

            studentsGrades.set(3, 3);
            t2.getStudentsGrades().set(2, 2);

            System.out.println(t1);
            System.out.println(t2);
        } catch (CloneNotSupportedException e) {
            System.out.println("nah");
        }
    }
}
