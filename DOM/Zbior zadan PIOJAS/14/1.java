import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        if (firstName == null || lastName == null) {
            System.out.println("Invalid Input");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        if (age < 0) {
            this.age = 0;
        }
    }

    @Override
    public String toString() {
        return "Person:\n" +
                "firstName='" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", age= " + age +
                "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Smith", 25);
        Person person2 = new Person("John", "Smith", 25);
        Person person3 = new Person("John", "Lick", 25);

        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person2.equals(person));
        System.out.println(person.equals(person3));
    }
}
