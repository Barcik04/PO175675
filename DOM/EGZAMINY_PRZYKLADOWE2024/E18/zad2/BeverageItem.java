package zad2;

public class BeverageItem implements Comparable<BeverageItem>{
    private String name;
    private double volume;
    private double sugarContent;

    public BeverageItem(String name, double volume, double sugarContent) {
        this.name = name;
        this.volume = volume;
        this.sugarContent = sugarContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    @Override
    public int compareTo(BeverageItem o) {
        return Double.compare(this.sugarContent, o.sugarContent);
    }

    @Override
    public String toString() {
        return "name: " + name + ", volume: " + volume + ", sugarContent: " + sugarContent;
    }
}
