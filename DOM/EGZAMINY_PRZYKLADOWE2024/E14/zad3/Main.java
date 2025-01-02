package zad3;


public class Main {
    public static <T extends Comparable<T>> int countLessThanOrEqual(T[] arr, T item) {
        int count = 0;
        for (T obj : arr) {
            if (obj.compareTo(item) <= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Person[] persons = {
                new Person("John Doe", 10),
                new Person("Raman", 20),
                new Person("Igor", 30)
        };

        System.out.println(countLessThanOrEqual(persons, persons[2]));
    }
}
