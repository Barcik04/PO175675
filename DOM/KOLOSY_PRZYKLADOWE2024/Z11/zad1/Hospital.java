package zad1;

public class Hospital implements Cloneable{
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = name != null ? name : "";
        this.capacity = capacity < 0 ? 50.0 : capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return Hospital.class.getSimpleName() + " name: " + name + ", capacity: " + capacity;
    }

    @Override
    public Hospital clone() throws CloneNotSupportedException {
        return (Hospital) super.clone();
    }
}
