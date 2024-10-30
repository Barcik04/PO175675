import java.util.Objects;

public class Intern extends Employee {
    public int internshipLength;

    public Intern(String name, String department, double salary, int internshipLength) {
        super(name, department, salary);
        this.internshipLength = internshipLength;
    }

    public int getInternshipLength() {
        return internshipLength;
    }
    public void setInternshipLength(int internshipLength) {
        this.internshipLength = internshipLength;
    }


    public String toString() {
        return super.toString() + "\nIntern Length: " + internshipLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Intern intern)) return false;
        if (!super.equals(o)) return false;
        return internshipLength == intern.internshipLength && Objects.equals(intern.name, name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), internshipLength);
    }
}
