package zad22;

public class ElectricCar extends Car {
    public ElectricCar(String model, int year) {
        super(model, year);
    }

    public static <T extends Car> boolean compareObjects(T object1, T object2) {
        return object1.getClass() == object2.getClass();
    }

    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", 2019);
        ElectricCar ec2 = new ElectricCar("VolksWagen", 2021);

        System.out.println(compareObjects(ec1, ec2));
    }
}
