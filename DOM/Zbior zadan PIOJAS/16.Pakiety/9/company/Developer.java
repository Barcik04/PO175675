package company;

public class Developer extends Employee{
    public Developer(String firstName, String lastName, double salary) {
        super(firstName, lastName, salary);
    }

    public double yearlySalary() {
        return super.yearlySalary();
    }

    @Override
    public String toString() {
        return super.toString() + "\nyearly salary: " + yearlySalary();
    }
}
