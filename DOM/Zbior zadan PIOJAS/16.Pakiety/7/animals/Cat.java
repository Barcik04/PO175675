package animals;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(super.getName() + "Meows!");
    }
}
