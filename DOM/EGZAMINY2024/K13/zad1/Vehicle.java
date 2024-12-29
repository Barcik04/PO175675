package zad1;

public interface Vehicle {
    void startEngine(String fuelType);
    boolean canDrive(int fuelLevel);
    default void stop() {
        System.out.println("Stopping vehicle");
    }
    default void honk() {
        System.out.println("pi biiiiip");
    }
    static String info() {
        return Vehicle.class.getSimpleName();
    }
}
