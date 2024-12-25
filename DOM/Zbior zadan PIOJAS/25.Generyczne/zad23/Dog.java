package zad23;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static <T extends Animal> T findMax(Pair<? extends T> pair) {
        T first = pair.getFirst();
        T second = pair.getSecond();

        if (first.getAge() > second.getAge()) {
            return first;
        } else if (first.getAge() < second.getAge()) {
            return second;
        }
        return null;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobo", 19);
        Dog dog2 = new Dog("Yolo", 9);

        Pair<Dog> pair = new Pair<>(dog1, dog2);

        System.out.println(findMax(pair));
    }
}
