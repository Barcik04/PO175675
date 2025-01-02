package zad1;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        double[] arr1 = {1,2,3,4,5,6,7};
        double[] arr2 = {1,2,3,3,1,2,5,1};
        Athlete[] athletes = {
                new Athlete("Igor", "Poland", arr1)
                ,new Athlete("Igor", "Angola", arr2)
                ,new Athlete("Jurek", "Swedeen", arr1)
        };

        Arrays.sort(athletes, new RecordComparator().thenComparing(new NationalityNameCmparator()));
        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }

    }
}
