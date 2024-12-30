package zad1;

public class TestSpacecraft {
    public static void main(String[] args) {
        double[] ratings = {1.1, 4.2, 3.2, 5.0};
        Spacecraft sp1 = new Spacecraft("Igho", "Toyota", ratings);
        Spacecraft sp2 = new Spacecraft("Balarski", "Audi", ratings);

        sp1.addRating(2.9);
        System.out.println(sp1);
        sp1.removeRating(1);
        System.out.println(sp1);

        System.out.println(sp1.equals(sp2));
        System.out.println(sp1.hashCode());
    }
}
