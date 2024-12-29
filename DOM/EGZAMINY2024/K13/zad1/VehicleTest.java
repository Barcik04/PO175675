package zad1;

public class VehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car("diesel", 20);
        Car car2 = new Car("liben", 20);
        Car car3 = new Car("diesel", 2);

        car1.startEngine(car1.getFuelType());
        System.out.println(car1.canDrive(car1.getFuelLevel()));
        car1.stop();
        car1.honk();
        System.out.println(Vehicle.info());

        car2.startEngine(car2.getFuelType());
        System.out.println(car3.canDrive(car2.getFuelLevel()));
    }
}
