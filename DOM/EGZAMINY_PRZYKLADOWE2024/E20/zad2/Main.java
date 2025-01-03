package zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef(1, "Igor", 4.2));
        chefs.add(new Chef(2, "Sam", 3.5));
        chefs.add(new Chef(3, "Bobby", 2.2));
        chefs.add(new Chef(4, "Jule", 3.5));

        Comparator<Chef> chefComparator = new Comparator<>() {
            @Override
            public int compare(Chef o1, Chef o2) {
                int result = Double.compare(o2.getSkillLevel(), o1.getSkillLevel());
                if (result == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        };

        Collections.sort(chefs, chefComparator);

        System.out.println("Sorted Chefs:");
        for (Chef chef : chefs) {
            System.out.println(chef);
        }
    }
}
