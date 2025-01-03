package zad1;

import java.util.Arrays;

public class Pilot implements Cloneable {
    private String name;
    private double[] flightHours;

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        this.flightHours = flightHours != null ? flightHours : new double[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(double[] flightHours) {
        this.flightHours = flightHours;
    }

    @Override
    public Pilot clone() throws CloneNotSupportedException {
        Pilot result = (Pilot) super.clone();
        result.flightHours = Arrays.copyOf(flightHours, flightHours.length);
        return result;
    }

    @Override
    public String toString() {
        return "name: " + name + ", flightHours: " + Arrays.toString(flightHours);
    }
}
