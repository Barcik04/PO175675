package zad16;

public class HeadTeacher extends Teacher implements Cloneable {
    private double bonus;

    public HeadTeacher(String name, int age, double salary, double bonus) {
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
        HeadTeacher cloned = (HeadTeacher) super.clone();
        cloned.setBonus(this.bonus);
        return cloned;
    }

    @Override
    public String toString() {
        return super.toString() + " bonus: " + bonus;
    }
}
