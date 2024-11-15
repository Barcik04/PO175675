package Eng;

import java.util.Objects;

public class Engine {
    protected int power;
    protected String type;
    protected int serialNumber;

    public Engine(int power, String type, int serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "power: " + power + ", type: " + type + ", serialNumber: " + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power && serialNumber == engine.serialNumber && Objects.equals(type, engine.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, type, serialNumber);
    }
}
