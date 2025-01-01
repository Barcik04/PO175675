package zad1;

import java.util.Objects;

public class Hospital {
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
        this.name = name != null ? name : "";
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity < 0 ? 50.0 : capacity;
    }

    @Override
    public String toString() {
        String resultAll = String.format("[%s]: Name: [%s]. Capacity: [%s]", Hospital.class.getSimpleName(), getName(), getCapacity());
        String resultNoName = String.format("[%s]: Capacity: [%s]", Hospital.class.getSimpleName(), getCapacity());
        if (this.name.isEmpty()) return resultNoName;
        return resultAll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Double.compare(capacity, hospital.capacity) == 0 && Objects.equals(name, hospital.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
