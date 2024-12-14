package zad10;

public class Car implements VehicleManager {
    @Override
    public String startEngine() {
        return "The engine has started";
    }

    @Override
    public int getFuelLevel() {
        return 50;
    }
}
