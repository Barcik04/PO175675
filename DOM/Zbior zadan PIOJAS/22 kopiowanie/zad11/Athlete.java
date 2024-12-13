package zad11;

import java.util.Arrays;

public class Athlete implements Cloneable {
    private String name;
    private double[] times = new double[6];

    public Athlete(String name, double[] times) {
        this.name = name;
        this.times = times;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getTimes() {
        return times;
    }

    public void setTimes(double[] times) {
        this.times = times;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Athlete athlete = (Athlete) super.clone();
        athlete.times = this.times.clone();
        return athlete;
    }

    @Override
    public String toString() {
        return "name: " + name + " times:\n\t" + Arrays.toString(times) + "\n\n";
    }

    public static void main(String[] args) {
        double[] times = {1.21, 5.20, 7.43, 18.98};

        Athlete a1 = new Athlete("Usain", times);

        try {
            Athlete a2 = (Athlete) a1.clone();
            times[2] = 4.78;
            a2.getTimes()[2] = 4.76;

            System.out.println(a1);
            System.out.println(a2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failed");
        }
    }
}
