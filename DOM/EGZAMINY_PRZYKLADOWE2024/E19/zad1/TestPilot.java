package zad1;

import java.util.ArrayList;
import java.util.List;

public class TestPilot {
    public static void main(String[] args) {
        Pilot p1 = new Pilot("Igor", new ArrayList<Double>(List.of(1.0, 2.0, 3.0, 4.0, 5.0)));

        try {
            Pilot pCloned = p1.clone();

            p1.changeByIndex(2, 200.0);
            System.out.println(p1);
            System.out.println(pCloned);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}
