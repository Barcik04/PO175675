public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jablko";
        person.introduceYourself();

        Person person2 = new Person();
        person2.name = "Gazil";

        person.changeName("Jaca baca");

        System.out.println("Before Swap");
        person.introduceYourself();
        person2.introduceYourself();

        System.out.println("After swap");
        person.swapNames(person2);
        person.introduceYourself();
        person2.introduceYourself();
    }
}
