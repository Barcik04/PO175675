package zad2;

import java.util.ArrayList;
import java.util.List;

public class TestMountain {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0, 5.0));
        Mountain m1 = new Mountain("Kilimanjaro", arr);
        try {
            Mountain m2 = m1.clone();
            m2.setHeights(new ArrayList<>(List.of(1.0, 2.1, 2.2, 21.9)));

            System.out.println(m1);
            System.out.println(m2);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
