package zad3;

import java.util.Arrays;

public class TestFruit {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Fruit("Apple", 1.5),
            new Fruit("Banana", 0.5),
            new Fruit("Orange", 3.5),
            new Fruit("Pear", 0.5)
        };

        Fruit result = Main.firstMinValue(fruits);
        System.out.println(result);

        System.out.println("\n");

        Arrays.sort(fruits);
        for (Fruit f : fruits) {
            System.out.println(f);
        }
    }
}
