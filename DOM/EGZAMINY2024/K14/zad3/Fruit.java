package zad3;

public class Fruit implements Comparable<Fruit>{
    private String name;
    private double sweetness;

    public Fruit(String name, double sweetness) {
        this.name = name;
        this.sweetness = sweetness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSweetness() {
        return sweetness;
    }

    public void setSweetness(double sweetness) {
        this.sweetness = sweetness;
    }

    @Override
    public String toString() {
        return "Name: " + name + " sweetness: " + sweetness;
    }

    @Override
    public int compareTo(Fruit o) {
        return Double.compare(this.sweetness, o.sweetness);
    }
}
