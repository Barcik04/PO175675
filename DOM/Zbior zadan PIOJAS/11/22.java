import java.util.ArrayList;

public class GradeBook {
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grade;

    public GradeBook(String firstName, String lastName, ArrayList<Integer> grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public ArrayList<Integer> getGrade() {
        return grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGrade(ArrayList<Integer> grade) {
        this.grade = new ArrayList<>(grade);
    }

    public void addGrade(int grade) {
        this.grade.add(grade);
    }

    public void removeGrade(int index) {
        this.grade.remove(index);
    }

    public void calculateAverage() {
        int sum = 0;
        for (int i = 0; i < grade.size(); i++) {
            sum += grade.get(i);
        }
        double avg = (double) sum / grade.size();
        System.out.println(avg);
    }

    public static void main(String[] args) {
        ArrayList<Integer> gradesArray1 = new ArrayList<>();
        gradesArray1.add(1);
        gradesArray1.add(2);

        GradeBook student1 = new GradeBook("Jablko", "Kokski", gradesArray1);

        student1.calculateAverage();
        student1.addGrade(4);
        student1.removeGrade(0);
        System.out.println(student1.getGrade());
    }
}
