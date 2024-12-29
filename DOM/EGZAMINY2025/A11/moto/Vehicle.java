package moto;

public class Vehicle implements Comparable<Vehicle>{
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
    public int compareTo(Vehicle o) {
        return Double.compare(this.speed, o.speed);
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Speed: " + speed;
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("VH1", 11.0),
                new Vehicle("VH2", 12.0),
                new Vehicle("VH3", 9.0)
        };

        Vehicle vehicle = Main.maxValue(vehicles);
        System.out.println(vehicle);
    }
}
