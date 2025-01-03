package zad1;

import java.util.ArrayList;

public class Pilot implements Cloneable{
    private String name;
    private ArrayList<Double> flightHours;

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = flightHours != null ? new ArrayList<>(flightHours) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getFlightHours() {
        return new ArrayList<>(flightHours);
    }

    public void setFlightHours(ArrayList<Double> flightHours) {
        this.flightHours = flightHours != null ? new ArrayList<>(flightHours) : new ArrayList<>();
    }

    @Override
    public Pilot clone() throws CloneNotSupportedException {
        Pilot result = (Pilot) super.clone();
        result.flightHours = new ArrayList<>(flightHours);
        return result;
    }

    @Override
    public String toString() {
        return "name: " + name + ", flightHours: " + flightHours;
    }

    public void changeByIndex(int index, double value) {
        if (index < 0 || index >= flightHours.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        flightHours.set(index, value);
    }
}
