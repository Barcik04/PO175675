public class Person {
    String name;
    static int counter = 0;

    public Person(String name) {
        this.name = name;
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main (String[] args) {
        Person p1 = new Person("John");
        Person p2 = new Person("Jane");
        Person p3 = new Person("Bob");
        System.out.println(p1.getCounter());
    }
}
