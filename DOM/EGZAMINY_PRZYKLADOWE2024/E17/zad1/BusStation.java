package zad1;

import java.util.ArrayList;
import java.util.Objects;

public class BusStation {
    private String name;
    private String city;
    private ArrayList<String> buses;

    public BusStation(String name, String city, ArrayList<String> buses) {
        this.name = name;
        this.city = city;
        this.buses = buses != null ? new ArrayList<>(buses) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getBuses() {
        return new ArrayList<>(buses);
    }

    public void setBuses(ArrayList<String> buses) {
        this.buses = buses != null ? new ArrayList<>(buses) : new ArrayList<>();
    }

    public void addBus(String bus) {
        buses.add(bus);
    }

    public void removeBus(String bus) {
        buses.remove(bus);
    }

    @Override
    public String toString() {
        return "name: " + name + ", city: " + city + ", buses: " + buses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusStation that = (BusStation) o;
        return Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(buses, that.buses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, buses);
    }
}
