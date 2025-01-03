package zad4;

public class Main {
    public static <T extends Animal> boolean isSameSpecies(T animal1, T animal2) {
        if (animal1 == null || animal2 == null) {
            throw new IllegalArgumentException("Arguments can't be null");
        }

        return animal1.getClass().equals(animal2.getClass());
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 21, "Dog");
        Dog dog2 = new Dog("Buddy", 22, "BOg");
        System.out.println("Are dog1 and dog2 the same species? " + isSameSpecies(dog1, dog2)); // true

        // Test case: Dog and Animal
        Animal animal = new Animal("Generic Animal", 1);
        System.out.println("Are dog1 and animal the same species? " + isSameSpecies(dog1, animal)); // false
    }
}
