package zad2;

public class Oven implements Appliance{
    @Override
    public void turnOn(String powerSource) {
        if (powerSource.equalsIgnoreCase("elektrycznosc") || powerSource.equalsIgnoreCase("gaz")) {
            System.out.println("Piekarnik wlaczony i zasilany " + powerSource);
        } else {
            System.out.println("NIeznane zrodlo zasilania");
        }
    }

    @Override
    public boolean isReady(int temperature) {
        return temperature > 180;
    }
}
