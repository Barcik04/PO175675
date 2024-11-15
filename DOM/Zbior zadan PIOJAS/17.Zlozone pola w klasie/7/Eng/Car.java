package Eng;

import java.util.Objects;

public class Car {
    protected String make;
    protected String model;
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "brand: " + make + " model: " + model + " engine: " + engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, engine);
    }
}
