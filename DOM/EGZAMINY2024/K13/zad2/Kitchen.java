package zad2;

public class Kitchen implements Cloneable{
    private String name;
    private Stove stove;

    public Kitchen(String name, Stove stove) {
        this.name = name;
        this.stove = stove;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stove getStove() {
        return stove;
    }

    public void setStove(Stove stove) {
        this.stove = stove;
    }

    @Override
    public Kitchen clone() throws CloneNotSupportedException {
        Kitchen kitchen = (Kitchen) super.clone();
        kitchen.stove = stove.clone();
        return kitchen;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Stove: " + stove.toString();
    }
}
