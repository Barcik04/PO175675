package zad2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TravelItem[] items = {
                new TravelItem("Igor", 29.0, 22.1),
                new TravelItem("Ivan", 30.0, 22.2),
                new TravelItem("Bagan", 28.0, 22.3),
                new TravelItem("Kryisviuk", 10.0, 22.0)
        };

        Arrays.sort(items);
        for (TravelItem item : items) {
            System.out.println(item);
        }
    }
}
