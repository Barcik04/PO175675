package zad1;

import java.util.Objects;

public class Vunue {
    private String name;
    private String city;
    private int capacity;
    private int parkingSpaces;

    public Vunue(String name, String city, int capacity, int parkingSpaces) {
        this.name = name != null ? name : "";
        this.city = city != null ? city : "";
        this.capacity = capacity > 0 ? capacity : 0;
        this.parkingSpaces = parkingSpaces > 0 ? parkingSpaces : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name : "";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city != null ? city : "";
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity > 0 ? capacity : 0;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces > 0 ? parkingSpaces : 0;
    }

    @Override
    public String toString() {
        return "name: " + name + ", city: " + city + ", capacity: " + capacity + ", parkingSpaces: " + parkingSpaces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vunue vunue = (Vunue) o;
        return capacity == vunue.capacity && parkingSpaces == vunue.parkingSpaces && Objects.equals(name, vunue.name) && Objects.equals(city, vunue.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, capacity, parkingSpaces);
    }
}
