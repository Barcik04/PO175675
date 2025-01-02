package zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BusStation b1 = new BusStation("Oslztyn", "Olszytyn", new ArrayList<>(List.of("Redykajny", "Gutkowo", "Brzeziny")));
        IntercityBusStation ib1 = new IntercityBusStation("Olsztyn Zachodni", "Olsztyn" , new ArrayList<>(List.of("Redykajny", "Gutkowo", "Brzeziny")), 4);



        ib1.addBus("Pieczewo");
        ib1.removeBus("Gutkowo");

        System.out.println(ib1);
    }
}
