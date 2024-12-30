package zad4;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book("Hobbit", "Tolkien"));
        books.add(new Book("Toy Story", "Tolkien"));
        books.add(new Book("Shrek", "Tolkien"));

        HashSet<Book> books1 = new HashSet<>();
        books.add(new Book("Hobbita", "Tolkien"));
        books.add(new Book("Toy Story", "Tolkien"));
        books.add(new Book("Shrek", "Tolkien"));

        Algorithm alg = new Algorithm();
        System.out.println(alg.isSubset(books, books1));
    }
}
