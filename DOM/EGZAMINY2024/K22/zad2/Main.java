package zad2;

public class Main {
    public static void main(String[] args) {
        double[] grades = {1.0, 1.2, 1.2, 6.0, 5.2, 6.0};
        Teacher teacher = new Teacher("Igor", grades);

        try {
            Teacher gradesCloned = teacher.clone();

            grades[2] = 1.0;
            gradesCloned.setStudentsGrades(grades);
            System.out.println(gradesCloned);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}
