package zad1;

public class Hotel implements Cloneable {
    private String name;
    private double capacity;

    public Hotel(String name, double capacity) {
        this.name = name != null ? name : "";
        this.capacity = capacity < 0 ? 50.0 : capacity;
    }

    @Override
    public String toString() {
        return Hotel.class.getSimpleName() + " name: " + name + ", capacity: " + capacity;
    }

    @Override
    public Hotel clone() throws CloneNotSupportedException {
        return (Hotel) super.clone();
    }
}
