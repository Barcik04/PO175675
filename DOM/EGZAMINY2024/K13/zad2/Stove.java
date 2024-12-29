package zad2;

public class Stove implements Cloneable{
    private int burners;
    private String brand;
    private int serialNumber;

    public Stove(int burners, String brand, int serialNumber) {
        this.burners = burners;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public int getBurners() {
        return burners;
    }

    public void setBurners(int burners) {
        this.burners = burners;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public Stove clone() throws CloneNotSupportedException {
        return (Stove) super.clone();
    }

    @Override
    public String toString() {
        return "\n" + "Stove: " + burners + ", " + brand + ", " + serialNumber;
    }
}
