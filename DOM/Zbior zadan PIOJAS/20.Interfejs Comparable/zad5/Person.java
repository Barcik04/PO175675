package zad5;

import java.time.LocalDate;
import java.util.Arrays;

public class Person implements Comparable<Person>{
    private String name;
    private int height;
    private LocalDate dateOfBirth;

    public Person(String name, int height, LocalDate dateOfBirth) {
        this.name = name;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    @Override
    public int compareTo(Person other) {
        return Integer.compare(other.height, this.height);
    }

    @Override
    public String toString() {
        return "name: " + name + ", height: " + height + ", dateOfBirth: " + dateOfBirth;
    }


    public static void main(String[] args) {
        Person[] people = {
                new Person("John Pork", 171, LocalDate.of(1998, 1, 1)),
                new Person("Jill Lincoln", 199, LocalDate.of(2000, 2, 19)),
                new Person("Bob Bobby Bee III", 189, LocalDate.of(1971, 7, 12))
        };

        Arrays.sort(people);

        for (Person per : people) {
            System.out.println(per);
        }
    }
}


