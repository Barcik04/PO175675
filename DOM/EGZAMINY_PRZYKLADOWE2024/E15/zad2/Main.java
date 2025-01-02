package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete("Barcik", "Sailing", 2020));
        athletes.add(new Athlete("Bob", "Sailing", 2021));
        athletes.add(new Athlete("Alice", "Sailing", 2001));
        athletes.add(new Athlete("Bob", "Sailing", 2024));

        Collections.sort(athletes);
        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }
    }
}
