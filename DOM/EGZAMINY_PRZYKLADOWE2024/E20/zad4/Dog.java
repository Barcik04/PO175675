package zad4;


import java.util.Objects;

public class Dog extends Animal {
    private String species;

    public Dog(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
