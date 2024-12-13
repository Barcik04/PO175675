package zad18;

public class HeadNurse extends Nurse implements Cloneable{
    private double bonus;

    public HeadNurse(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        HeadNurse cloned = (HeadNurse) super.clone();
        cloned.setBonus(this.bonus);
        return cloned;
    }

    @Override
    public String toString() {
        return super.toString() + " bonus: " + bonus;
    }
}
