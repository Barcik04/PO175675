package zad22;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Zebra", 82));
        animals.add(new Animal("Pig", 72));
        animals.add(new Animal("Sheep", 60));
        animals.add(new Dog("Dog", 70, "Chincua"));
        animals.add(new Dog("Dog", 7, "China"));

        animals.sort(null);

        for(Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
