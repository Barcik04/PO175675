package generyczne1;

import java.util.Arrays;

public class Main {
    public static <T extends Comparable<T>> T sortAndReturnFirst(T[] arr) throws EmptyArrayException {
        if (arr == null || arr.length == 0) {
            throw new EmptyArrayException("Lista nie moze byc pusta!");
        }

        Arrays.sort(arr);

        return arr[0];
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Hoobit", "Tolkien"),
                new Book("Lord", "Tolkien"),
                new Book("A", "Tolkien")
        };

        try {
            Book result = sortAndReturnFirst(books);
            System.out.println(result);
        } catch (EmptyArrayException e) {
            System.out.println(e.getMessage());
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
