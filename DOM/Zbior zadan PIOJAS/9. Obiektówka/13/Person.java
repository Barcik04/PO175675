public class Person {
    public String name;

    public void introduceYourself() {
        System.out.println("Hi Im " + name);
    }

    public void sayHello(Person otherPerson) {
        System.out.println("Hello " + otherPerson.name);
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void swapNames(Person otherPerson) {
        String temp = this.name;
        this.name = otherPerson.name;
        otherPerson.name = temp;
    }
}
