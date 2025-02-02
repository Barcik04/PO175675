package zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Igor", new ArrayList<>(List.of(1, 2, 3, 4, 5, 6)));

        try {
            Student stC = st1.clone();
            stC.setGrades(new ArrayList<>(List.of(1, 2, 3, 9)));
            System.out.println(st1);
            System.out.println(stC);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
