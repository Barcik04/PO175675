package zad12;

public class SmartLamp implements AdvancedPowerControl {
    @Override
    public void turnOn() {
        System.out.println("SmartLamp is on");
    }

    @Override
    public void setPowerSavingMode() {
        System.out.println("PowerSaving mode is ON");
    }
}
