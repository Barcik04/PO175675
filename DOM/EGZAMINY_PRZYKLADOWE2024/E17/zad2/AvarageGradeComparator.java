package zad2;

import java.util.Comparator;

public class AvarageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.avarageGrade(), s1.avarageGrade());
    }
}
