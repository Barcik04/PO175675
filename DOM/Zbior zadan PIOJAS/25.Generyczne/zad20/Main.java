package zad20;

public class Main {
    public static <T extends Object> void printObjectInfo(T arg) {
        if (arg == null) {
            System.out.println("null");
            return;
        }
        System.out.println(arg);
        System.out.println(arg.hashCode());
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2001);
        Main.printObjectInfo(car1);

        Animal animal1 = new Animal("Giraffe", 20);
        Main.printObjectInfo(animal1);
    }
}
