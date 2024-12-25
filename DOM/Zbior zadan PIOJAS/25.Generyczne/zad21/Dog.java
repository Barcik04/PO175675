package zad21;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public static <T extends Animal> T findMax(T element1,T element2 ) {
        if (element2.getAge() > element1.getAge()) {
            return element2;
        } else if (element2.getAge() < element1.getAge()) {
            return element1;
        }
        if (element1.getAge() == element2.getAge()) {
            throw
                    new IllegalArgumentException("==");
        }

        return null;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Puszek", 1);
        Dog dog2 = new Dog("Okruszek", 2);

        System.out.println(findMax(dog1, dog2));
    }
}
