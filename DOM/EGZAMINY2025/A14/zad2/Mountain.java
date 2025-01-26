package zad2;

import java.util.ArrayList;
import java.util.Arrays;

public class Mountain implements Cloneable {
    private String name;
    private ArrayList<Double> heights;

    public Mountain(String name, ArrayList<Double> heights) {
        this.name = name;
        this.heights = heights != null ? new ArrayList<>(heights) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getHeights() {
        return new ArrayList<>(heights);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeights(ArrayList<Double> heights) {
        this.heights = heights != null ? new ArrayList<>(heights) : new ArrayList<>();
    }

    @Override
    public Mountain clone() throws CloneNotSupportedException {
        Mountain cloned = (Mountain) super.clone();
        cloned.heights = new ArrayList<>(heights);
        return cloned;
    }

    @Override
    public String toString() {
        return "name: " + name + ", heights: " + Arrays.toString(heights.toArray());
    }
}
