package zad14;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Kolman", 33),
                new Person("Gabriel", 21),
                new Person("Olivia", 81)
        };

        Person resultInt = Valuation.minValue(persons);
        System.out.println(resultInt);
    }
}
