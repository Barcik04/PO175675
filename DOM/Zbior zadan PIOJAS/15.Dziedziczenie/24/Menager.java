import java.util.Objects;

public class Menager extends Employee {
    public double bonus;

    public Menager(String name, String department, double salary, double bonus) {
        super(name, department, salary);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menager menager)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(bonus, menager.bonus) == 0 && Objects.equals(menager.name, name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }
}
