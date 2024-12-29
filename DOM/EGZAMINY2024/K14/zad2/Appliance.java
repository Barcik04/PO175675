package zad2;

public interface Appliance {
    void turnOn(String powerSource);
    boolean isReady(int temperature);
    default void turnOff() {
        System.out.println("appliance is off");
    }
    default void emitSound() {
        System.out.println("bzzzzzzz");
    }
    static String info() {
       return Appliance.class.getSimpleName();
    }
}
