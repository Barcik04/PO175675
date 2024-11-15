import Eng.Car;
import Eng.Engine;

public class Main {
    public static void main(String[] args) {
        Engine eng = new Engine(199, "V8", 177792);
        Car car1 = new Car(eng);
        System.out.println(car1);
        car1.setMake("Lambda");
        car1.setModel("Cocomelo");
        System.out.println(car1);
    }
}