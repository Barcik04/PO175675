package zad19;

public class Car implements Cloneable{
    private String marka;
    private String model;
    private Engine engine;

    public Car(String marka, String model, Engine engine) {
        this.marka = marka;
        this.model = model;
        this.engine = engine;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
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
    protected Object clone() throws CloneNotSupportedException {
        Car cloned = (Car) super.clone();
        cloned.engine = (Engine) engine.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "marka: " + marka + ", model: " + model + ", engine: " + engine;
    }
}
