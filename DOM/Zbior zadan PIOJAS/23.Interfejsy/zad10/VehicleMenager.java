package zad10;

public class VehicleMenager {
    public static void main(String[] args) {
        Car c1 = new Car();

        System.out.println(c1.startEngine());
        System.out.println(c1.getFuelLevel());

        Motorcycle m1 = new Motorcycle();
        System.out.println(m1.startEngine());
        System.out.println(m1.getFuelLevel());
    }
}
