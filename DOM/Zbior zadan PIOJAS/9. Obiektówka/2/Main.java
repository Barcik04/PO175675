public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Yaris", 0);

        car1.accelerate(100);
        System.out.println(car1.getSpeed());
        car1.decelerate(190);
        System.out.println(car1.getSpeed());
    }
}