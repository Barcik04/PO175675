package zad1;


import java.util.ArrayList;
import java.util.List;

public class TestGames {
    public static void main(String[] args) {
        ArrayList<Double> dArr = new ArrayList<>(List.of(1.0, 1.1, 2.3, 5.0, 4.4));

        ComputerGame cg1 = new ComputerGame("Hobbit", "SEGA", dArr);
        ComputerGame cg2 = new ComputerGame("Lordoza", "SEGA", dArr);

        cg1.addRating(2.0);
        System.out.println(cg1.getRatings());

        cg2.removeRating(1.1);
        System.out.println(cg2.getRatings());

        System.out.println(cg1);

        System.out.println(cg1.equals(cg2));
        System.out.println(cg1.hashCode());
    }
}
