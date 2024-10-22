import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = Objects.requireNonNullElse(firstName, "-");

        this.lastName = Objects.requireNonNullElse(lastName, "-");

        this.age = Math.max(age, 0);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getAge();
    }


    public static void main(String[] args) {
        Person person1 = new Person("John", "Smith", 25);
        Person person2 = new Person("John", "Smith", -23);
        Person person3 = new Person("John", null, 25);

        System.out.println(person1);
        System.out.println(person2);
        person3.setAge(45);
        System.out.println(person3);
    }
}
