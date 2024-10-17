public class Car {
    public String brand;
    public String model;
    public int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public void decelerate(int speed) {
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }
}

