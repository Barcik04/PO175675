package zad19;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(121, "R5", "NL12009");
        Car c1 = new Car("Toyta", "Corolla", engine);

        try {
            Car c2 = (Car) c1.clone();
            c1.getEngine().setMoc(188);

            System.out.println(c1);
            System.out.println(c2);
        } catch (CloneNotSupportedException e) {
            System.out.println("no");
        }
    }
}
