package zad15;

public class Vehicle implements Comparable<Vehicle> {
    private String model;
    private double speed;

    public Vehicle(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "model: " + model + ", speed: " + speed;
    }

    @Override
    public int compareTo(Vehicle o) {
        return Double.compare(this.speed, o.speed);
    }


    public static void main(String[] args) {
        Vehicle[] arrDouble = {
                new Vehicle("tout", 200.5),
                new Vehicle("bolo", 220.1),
                new Vehicle("booler", 356.8),
        };

        Vehicle result = Main.maxValue(arrDouble);

        System.out.println(result);
    }
}

