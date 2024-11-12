package company;

public class Menager extends Employee {
    protected double bonus;

    public Menager(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double yearlySalary() {
        return super.yearlySalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nyearly salary: " + yearlySalary();
    }
}
