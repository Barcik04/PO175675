package zad1;

import java.util.Arrays;

public class Mountain implements Cloneable{
    private String name;
    private double[] heights;

    public Mountain(String name, double[] heights) {
        this.name = name;
        this.heights = Arrays.copyOf(heights, heights.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getHeights() {
        return Arrays.copyOf(heights, heights.length);
    }

    public void setHeights(double[] heights) {
        this.heights = Arrays.copyOf(heights, heights.length);
    }

    @Override
    public Mountain clone() throws CloneNotSupportedException {
        Mountain mountain = (Mountain) super.clone();
        mountain.heights = Arrays.copyOf(heights, heights.length);
        return mountain;
    }
}
