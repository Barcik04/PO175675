package computers;

public class Laptop extends Computer {
    private int weight;

    public Laptop(String brand, String processor, int weight) {
        super(brand, processor);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nweight: " + weight + "\n";
    }
}
