package zad3;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("BMW", 100),
                new Vehicle("Maseratti", 110),
                new Vehicle("Audi", 98),
                new Vehicle("BMW", 112)
        };

        System.out.println(Alg.maxValue(vehicles));
    }
}
