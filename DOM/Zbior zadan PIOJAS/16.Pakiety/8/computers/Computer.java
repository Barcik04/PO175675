package computers;

import java.util.Objects;

public class Computer {
    private String brand;
    private String processor;

    public Computer(String brand, String processor) {
        this.brand = brand;
        this.processor = processor;
    }

    public Computer() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return Objects.equals(brand, computer.brand) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }

    @Override
    public String toString() {
        return "Number:" + hashCode() + ", Brand: " + brand + ", Processor: " + processor;
    }
}
