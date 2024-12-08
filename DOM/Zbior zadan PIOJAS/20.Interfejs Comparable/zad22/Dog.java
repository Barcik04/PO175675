package zad22;

public class Dog extends Animal {
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public int compareTo(Animal other) {
        int result = super.compareTo(other);
        if (result == 0) {
            return this.breed.compareTo(((Dog) other).breed);
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Breed: " + breed;
    }
}
