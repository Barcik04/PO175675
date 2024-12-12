package zad12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName + ", birthDate: " + birthDate;
    }



    public static class LastNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getLastName().compareTo(p2.getLastName());
        }
    }

    public static class BirthDateComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getBirthDate().compareTo(p2.getBirthDate());
        }
    }


    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", "Cole", LocalDate.of(1990, 7, 12)));
        people.add(new Person("Kole", "Doe", LocalDate.of(1998, 1, 1)));
        people.add(new Person("Jane", "Aloe", LocalDate.of(1990, 1, 1)));

        people.sort(new BirthDateComparator().thenComparing(new LastNameComparator()));

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
