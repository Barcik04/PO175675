package zad22;

public class Animal implements Comparable<Animal>{
    private String species;
    private int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal other) {
        if (this.species.equals(other.species)) {
            return Integer.compare(this.age, other.age);
        }
        return this.species.compareTo(other.species);
    }

    @Override
    public String toString() {
        return "Animal: " + species + ", age: " + age;
    }
}
