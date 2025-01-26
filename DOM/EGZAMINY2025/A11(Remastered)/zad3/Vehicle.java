package zad3;

public class Vehicle implements Comparable<Vehicle>{
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(this.speed, o.speed);
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Speed: " + speed;
    }
}
