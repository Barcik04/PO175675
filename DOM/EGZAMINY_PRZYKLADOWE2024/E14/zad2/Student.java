package zad2;

public record Student(String name, double averageGrade, int yearOfStudy) implements Comparable<Student> {

    @Override
    public int compareTo(Student other) {
        int result = Double.compare(other.averageGrade, this.averageGrade);
        if (result != 0) {
            return Integer.compare(this.yearOfStudy, other.yearOfStudy);
        }
        return result;
    }
}
