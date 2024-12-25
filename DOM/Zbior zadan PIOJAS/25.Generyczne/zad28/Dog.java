package zad28;

public class Dog extends Animal {
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + " age: " + age;
    }

    public static void findMinMaxAge(Dog[] dogArr, Pair<? super Dog> pair) {
        Dog min = dogArr[0];
        Dog max = dogArr[0];

        for (Dog i : dogArr) {
            if (i.getAge() > max.getAge()) {
                max = i;
            }

            if (i.getAge() < min.getAge()) {
                min = i;
            }
        }

        pair.setFirst(min);
        pair.setSecond(max);
    }


    public static void main(String[] args) {
        Dog[] dogArr = {
                new Dog("Bob", 10),
                new Dog("Bobww", 8),
                new Dog("Bawob", 12)
        };

        Pair<Dog> resultArr = new Pair<>(null, null);
        findMinMaxAge(dogArr, resultArr);

        System.out.println(resultArr.getFirst());
        System.out.println(resultArr.getSecond());
    }
}
