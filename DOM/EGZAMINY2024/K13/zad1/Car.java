package zad1;

public class Car implements Vehicle {
    private String fuelType;
    private int fuelLevel;

    public Car(String fuelType, int fuelLevel) {
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine(String fuelType) {
        if (fuelType.equals("benzyna") || fuelType.equals("diesel")) {
            System.out.println("Silnik uruchomiony z użyciem " + fuelType);
        } else {
            System.out.println("Nieznany typ paliwa");
        }
    }

    @Override
    public boolean canDrive(int fuelLevel) {
        return fuelLevel > 5;
    }
}
