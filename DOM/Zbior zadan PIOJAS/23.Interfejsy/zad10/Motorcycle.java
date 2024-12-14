package zad10;

public class Motorcycle implements VehicleManager {
    @Override
    public String startEngine() {
        return "Motorcycle engine has started";
    }

    @Override
    public int getFuelLevel() {
        return 30;
    }
}
